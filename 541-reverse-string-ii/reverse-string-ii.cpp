class Solution {
public:
    string reverseStr(string s, int k) {
        if(s.length()>k)
        {
            int left=0;
            int right=k-1;
            while(right<s.size()-1)
            {
                rotate(s,left,right);
                left=left+k+k;
                right=right+k+k;
            }
            if(left<s.length()-1)
            {
                rotate(s,left,s.size()-1);
            }
            
        }else
        {
            rotate(s,0,s.size()-1);
        }
        return s;
        
    }
    void rotate(string& s,int left,int right)
    {
        
            while(left<=right)
            {
                swap(s,left,right);
                left++;
                right--;
            }
    }
    void swap(string& s,int left,int right)
    {
        int temp=s[left];
        s[left]=s[right];
        s[right]=temp;
    }
};
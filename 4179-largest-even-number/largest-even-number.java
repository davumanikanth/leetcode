class Solution {
    public String largestEven(String s) {
        int count=-1;
        
        for(int i=s.length()-1;i>=0;i--)
        {
            int num=s.charAt(i)-'0';
            if(num%2==0)
            {
                count=i;
                break;
            }
            
        }
        if(count==-1)
        {
            return "";
        }
        return s.substring(0,count+1);
        
    }
}
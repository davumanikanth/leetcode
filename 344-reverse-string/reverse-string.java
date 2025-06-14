class Solution {
    public void reverseString(char[] s) {
        char[] temp=new char[s.length];
        int index=0;
        for(int i=s.length-1;i>=0;i--)
        {
            temp[index++]=s[i];
        }
        for(int i=0;i<index;i++)
        {
            s[i]=temp[i];
        }
    }
}
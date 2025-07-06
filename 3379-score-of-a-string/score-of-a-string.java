class Solution {
    public int scoreOfString(String s) {
        int[] values=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            values[i]=(int)ch;
        }
        int diff=0;
        for(int i=0;i<values.length-1;i++)
        {
            diff+=Math.abs(values[i]-values[i+1]);

        }
        return diff;
    }
}
class Solution {
    public int sumBase(int n, int k) {
        int sum=0;
        String str=Integer.toString(n,k);
        for(int i=0;i<str.length();i++)
        {
            sum+=str.charAt(i)-'0';

        }
        return sum;
    }
}
class Solution {
    public int alternateDigitSum(int n) {
        int evensum=0;
        int oddsum=0;
        String intstr=Integer.toString(n);
        for(int i=0;i<intstr.length();i++)
        {
            if(i%2==0)
            {
                evensum+=intstr.charAt(i)-'0';
            }
            else
            {
                oddsum+=intstr.charAt(i)-'0';
            }
        }
        return evensum-oddsum;
        
    }
}
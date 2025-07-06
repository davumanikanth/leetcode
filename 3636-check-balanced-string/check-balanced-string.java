class Solution {
    public boolean isBalanced(String num) {
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<num.length();i++)
        {
            int ch=num.charAt(i)-'0';
            if(i%2==0)
            {
                evensum+=ch;
            }
            else
            {
                oddsum+=ch;
            }
        }
        if(evensum==oddsum)
        {
            return true;
        }
        return false;
    }
}
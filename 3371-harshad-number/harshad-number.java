class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int has=0;
        int a=x;
        while(a>0)
        {
            int digit=a%10;
            has+=digit;
            a=a/10;

        }
        if(x%has==0)
        {
           return has;
        }
        return -1;
    }
}
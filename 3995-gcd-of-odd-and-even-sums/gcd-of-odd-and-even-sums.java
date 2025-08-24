class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        for(int i=0;i<2*n;i++)
        {
            if(i%2==0)
            {
                even+=i;
            }
            else
            {
                odd+=i;
            }

        }
        return gcd(odd,even);

        
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
}
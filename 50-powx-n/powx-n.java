class Solution {
    public double myPow(double x, int n) {
    long N=n;
    if(N==0)
    {
        return 1;
    }  
    
    if(n<0)
    {
        x=1/x;
        N=-N;
       

    }
    return fastrec(x,N);
   

    }
    public double fastrec(double x,long n)
    {
        if(n==0)
        {
            return 1;
        }
        double half=fastrec(x,n/2);
        if(n%2==0)
        {
            return half*half;

        }
        else
        {
            return half*half*x;
        }
    }
    
    
}
class Solution {
    public int distributeCandies(int n, int limit) {
       int ways=0;
        for(int i=0;i<=limit;i++)
        {
            for(int j=0;j<=limit;j++)
            {
                for(int k=0;k<=limit;k++)
                {
                    if(i+k+j==n)
                    {
                        ways++;
                    }
                }
            }
        }
        return ways;
        
    }
}
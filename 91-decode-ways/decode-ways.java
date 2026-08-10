class Solution {
    public int solve(int i,String s,int[] dp)
    {
        if(i<0) return 1;
        if(dp[i]!=-1) return dp[i];
        
        int first=0;
        int second=0;
        if(s.charAt(i)!='0')
        {
            first=solve(i-1,s,dp);
            
        }

        if(i>=1)
        {
             int num=Integer.parseInt(s.substring(i-1,i+1));
             if(num>=10 && num<=26)
             {
               second=solve(i-2,s,dp);
             }
        }
        return dp[i]=first+second;
    }
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
    Arrays.fill(dp,-1);

        return  solve(s.length()-1,s,dp);
        
    }
}
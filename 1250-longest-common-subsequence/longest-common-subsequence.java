class Solution {
    public  int solve(int i,int j,String s,String s2,int[][] dp)
    {
        if(j<0) return 0;

        if(i<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
    
        if(s.charAt(i)==s2.charAt(j))
        {
            return  dp[i][j] = 1+solve(i-1,j-1,s,s2,dp);
        }
        return dp[i][j]=Math.max(solve(i-1,j,s,s2,dp),solve(i,j-1,s,s2,dp));

        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);

        }

        
      return solve(text1.length()-1,text2.length()-1,text1,text2,dp);
        
    }
}
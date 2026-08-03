class Solution {
    public int solve(int ind,int[] arr,int n,int[] dp)
    {
        if(ind>=arr.length) return 0;
        if (dp[ind] != Integer.MIN_VALUE)
            return dp[ind];
       int ans = Integer.MIN_VALUE;
        int sum=0;
        for(int i=ind;i<Math.min(ind+3,arr.length);i++)
        {
            sum+=arr[i];
            ans=Math.max(ans,sum-solve(i+1,arr,n,dp));

            
        }
        return dp[ind]=ans;
    }

    public String stoneGameIII(int[] arr) {
        int[] dp=new int[arr.length+1];
                Arrays.fill(dp, Integer.MIN_VALUE);

        int diff=solve(0,arr,arr.length,dp);
        if(diff>0) return "Alice";
        else if(diff<0) return "Bob";
        else return "Tie";

        
    }
}
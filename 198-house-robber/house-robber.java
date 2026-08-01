class Solution {
    int solve(int ind,int[] nums,int[] dp){
        if(ind<0) return 0;
        if(ind==0)
        {
            return nums[0];

        }
        if(dp[ind]!=-1) return dp[ind];
        int notpick=0+solve(ind-1,nums,dp);
        int pick=nums[ind]+solve(ind-2,nums,dp);
        return dp[ind]=Math.max(notpick,pick);

    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums.length-1,nums,dp);

        
    }
}
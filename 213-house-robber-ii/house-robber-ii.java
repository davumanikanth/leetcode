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
        if (nums.length == 1) return nums[0];

        int[] copy = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] copy1 = Arrays.copyOfRange(nums, 1, nums.length);

        int[] dp1 = new int[copy.length];
        int[] dp2 = new int[copy1.length];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        return Math.max(
            solve(copy.length - 1, copy, dp1),
            solve(copy1.length - 1, copy1, dp2)
        );
    }
}
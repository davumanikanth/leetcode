class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int present=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            if( nums[i]==nums[i-1])
            {
                 present=nums[i];
            }
        }
        return present;
        
    }
}
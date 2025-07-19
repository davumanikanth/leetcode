class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int mid=nums.length/2;
        if(nums.length==2)
        {
            return -1;
        }
        else if(nums[0]==nums[mid] || nums[nums.length-1]==nums[mid])
        {
            return -1;
        }
        return nums[mid];
        
    }
}
class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        int maxvalue=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int positive=nums[n-1]*nums[n-2]*nums[n-3];
        int negative=nums[0]*nums[1]*nums[n-1];
        maxvalue=Math.max(positive,negative);
        return maxvalue;

        
    }
}
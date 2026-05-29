class Solution {
    public int maximumStrongPairXor(int[] nums) {

        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {

                int diff = Math.abs(nums[i] - nums[j]);

                if(diff <= Math.min(nums[i], nums[j])) {
                    max = Math.max(max, nums[i] ^ nums[j]);
                }
            }
        }

        return max;
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int result=0;

        for(int i=0;i<n;i++)
        {
             result=result^nums[i];
        }
        return result;
        
    }
}
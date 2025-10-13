class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                 xor|=nums[i];
            }
        }
        
         return xor;
        
        
    }
}
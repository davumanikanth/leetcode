class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
       
        for(int i=0;i<n;i++)
        {
            if(sorted(nums))
            {
                return true;

            }
            rotated(nums);
            
        }
        return false;
        
    }
    public boolean sorted(int[] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public void rotated(int[] nums)
    {
        int first=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=first;
    }
}
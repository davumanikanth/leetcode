class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean increasing=false;
       boolean decreasing=false;
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i]<nums[i+1])
        {
            increasing =true;
        }
        else if(nums[i]>nums[i+1])
        {
            decreasing=true;
        }
        if(increasing==true && decreasing==true)
        {
            return false;
        }
       }
       return true;
    }
}
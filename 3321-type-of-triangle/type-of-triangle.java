class Solution {
    public String triangleType(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2])
        { 
            return "none";
        }
    
        if(nums[0]==nums[1] && nums[1]==nums[2])
        {
            return "equilateral";
        }
       
        else if(nums[0]==nums[1] || nums[1]==nums[2] )
        {
            return "isosceles";
        }
        else
        {
            return "scalene";
            
        }

        
    }
}
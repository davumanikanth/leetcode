class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        int maxvalue=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int dif=Math.abs(nums[i]-nums[i+1]);
            maxvalue=Math.max(dif,maxvalue);


        }
        return maxvalue;        
    }
}
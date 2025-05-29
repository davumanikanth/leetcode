class Solution {
    public int maximumCount(int[] nums) {
        int n =nums.length;
        int postive=0;
        int negative=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                postive++;
            }
            else if(nums[i]==0)
            {
                continue;
            }
            else
            {
                negative++;
            }
        }
        max=Math.max(postive,negative);
        return max;
        
    }
}
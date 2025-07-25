class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> group=new HashSet<>();
        Set<Integer> group1=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
            group.add(nums[i]);
            }
            else
            {

             group1.add(nums[i]);
            }
        }
        int sum=0;

         if(group.isEmpty())
         {
            int max=Integer.MIN_VALUE;
            for(int num:group1)
            max=Math.max(max,num);
            return max;

         }
        else
        {
        for(int num:group)
        {
            sum+=num;
        }
        return sum;
        }
        
        
    }
}
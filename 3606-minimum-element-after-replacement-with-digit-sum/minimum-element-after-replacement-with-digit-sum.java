class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(sum(nums[i]));
            min=Math.min(min,sum(nums[i]));
        }
        return min;      }
    public int sum(int n)
    {
         int sum=0;
         while(n>0)
         {
            int d=n%10;
            sum+=d;
            n/=10;
         }
         return sum;
    }}
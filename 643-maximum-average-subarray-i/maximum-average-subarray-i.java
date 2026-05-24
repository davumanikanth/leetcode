class Solution {
    public double findMaxAverage(int[] nums, int k) {

      int left=0;
      int right=k;
      double sum=0;
double max = Double.NEGATIVE_INFINITY;
      for(int i=0;i<k;i++)
      {
        sum+=nums[i];
      

      }
        max=Math.max(sum,max);
      while(right<nums.length)
      {
        sum-=nums[left];
        left++;
        sum+=nums[right];
        max=Math.max(sum,max);
        right++;


        
      } 
      return (double) max/k; 
    }
}
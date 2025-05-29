class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
      
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int product=1;
            for(int j=i;j<n;j++)
            {
                product=product*nums[j];
                if(product>max)
                {
                    max=Math.max(product,max);
                }
            }
        }
        return max;
        
    }
}
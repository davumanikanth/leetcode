class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
       long mod=1000000007;
       for(int i=0;i<queries.length;i++)
       {
         int l=queries[i][0];
         int r=queries[i][1];
         int k=queries[i][2];
         int v=queries[i][3];
         int index=l;

         while(index<=r)
         {
            long temp=nums[index];
            nums[index]=(int)((temp*v) % mod);
            index+=k;

         }
       }
         

         //xor for the nums
         int xor=0;

         for(int x=0;x<nums.length;x++)
         {
            xor=xor^ nums[x];

         }
         return xor;
         
         
         
                
    }
}
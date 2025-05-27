class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxvalue=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            maxvalue=Math.max(maxvalue,sum);
            if(sum<0)
            {
                sum =0;
            }
           
               
        }
        return maxvalue;
    }
}
//BRUTE FORCE SOLUTION
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n=nums.length;
//         int maxvalue=Integer.MIN_VALUE;

//         for(int i=0;i<n;i++)
//         {
//             int sum=0;
//             for(int j=i;j<n;j++)
//             {
//                 sum=sum+nums[j];
            
//             if(sum>maxvalue)
//             {
//                 maxvalue=sum;
                
//             }
//             }
           
//         }
//          return maxvalue;
        
//     }
// }
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            maxSum=Math.max(currentSum,maxSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n=nums.length;
//         int maxvalue=nums[0];
//         int sum=nums[0];
//         for(int i=1;i<n;i++)
//         {
//             sum=sum+nums[i];
//             if(sum<0)
//             {
//                 sum =0;
//             }
           
//                 maxvalue=Math.max(maxvalue,sum);
            
//         }
//         return maxvalue;
//     }
// }
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
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int k1 = 0;
        int k2 = 0;
        for(int i = 0;i < n;i++) {
            if(nums[i] > 0){
                pos[k1] = nums[i];
                k1++;
            }
            else{
                neg[k2] = nums[i];
                k2++;
            }
        }
        for(int i = 0;i < n / 2;i++) {
            nums[2 * i] = pos[i];
            nums[2 * i + 1] = neg[i];
        }
        return nums;
    }
}
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n=nums.length;
//         ArrayList<Integer> positive=new ArrayList<>();
//         ArrayList<Integer> negative=new ArrayList<>();

//         for(int i=0;i<n;i++)
//         {
//             if(nums[i]>0)
//             {
//                 positive.add(nums[i]);
//             }
//             else
//             {
//                 negative.add(nums[i]);
//             }
//         }
//         for(int i=0;i<n/2;i++)
//         {
//             nums[2*i]=positive.get(i);
//             nums[2*i+1]=negative.get(i);
//         }
//        return nums;

//     }
// }
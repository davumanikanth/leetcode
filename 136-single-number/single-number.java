class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int XORresult=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
          
                  XORresult=XORresult^nums[i]; //xor operation when same   a^a=0
                                               //                          a^0=a   
          
        }
       return XORresult;
        
    }
}
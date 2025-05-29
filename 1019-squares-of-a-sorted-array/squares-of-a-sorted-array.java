class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] newarray=new int[n];
         int index=0;
        for(int i=0;i<n;i++)
        {
            newarray[index++]=nums[i]*nums[i];
        }
        Arrays.sort(newarray);
        return newarray;
        
    }
}
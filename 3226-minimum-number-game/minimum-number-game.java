class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] alice=new int[nums.length/2];
        int[] bob=new int[nums.length/2];
        int index=0;
        int index1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2!=0)
            {
                alice[index++]=nums[i];
            }
            else

            {
                bob[index1++]=nums[i];
            }
        }
        int[] result=new int[nums.length];
        int index4=0;
        for(int i=0;i<Math.max(index,index1);i++)
        {
            if(i<index1)
            {
                result[index4++]=alice[i];
            }
            if(i<index)
            {
                result[index4++]=bob[i];
            }
        }
        return result;
        
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
      int mid=n/2;
      int[] first=new int[n];
      int[] second=new int[n];
      int index1=0;
      int index2=0;
      for(int i=0;i<nums.length/2;i++)
      {
        first[index1++]=nums[i];
      } 
      for(int i=nums.length/2;i<nums.length;i++)
      {
        second[index2++]=nums[i];

      }
      int[] result=new int[nums.length];
      int index3=0;
      for(int i=0;i<nums.length/2;i++)
      {
        if(i<first.length)
        {
            result[index3++]=first[i];
        }
        if(i<second.length)
        {
            result[index3++]=second[i];
        }
      }
      return result;
    
    }
}
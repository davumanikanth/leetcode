class Solution {
    public int missingNumber(int[] nums) {
      Set<Integer> result=new HashSet<>();
      int n=nums.length;
      for(int num: nums)
      {
        result.add(num);
      }
      for(int i=0;i<=n;i++)
      {
        if(!result.contains(i))
        {
            return i;
        }
      }
      return -1;

        
    }
}
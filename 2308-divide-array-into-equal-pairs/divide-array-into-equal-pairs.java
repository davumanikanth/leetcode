class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> group=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            group.put(nums[i],group.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:group.entrySet())
        {
            if(entry.getValue()%2!=0)
            {
                return false;
            }
        }
        return true;
    }
}
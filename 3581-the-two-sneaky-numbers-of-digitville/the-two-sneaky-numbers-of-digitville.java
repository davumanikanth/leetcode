class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> group=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            group.put(nums[i],group.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        int index=0;
        for(Map.Entry<Integer,Integer> entry:group.entrySet())
        {
            if(entry.getValue()==2)
            {
                count++;
            }
        }
        int[] values=new int[count];
        for(Map.Entry<Integer,Integer> entry:group.entrySet())
        {
            if(entry.getValue()==2)
            {
                values[index++]=entry.getKey();
            }
        }
        return values;
    }
}
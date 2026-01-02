class Solution {
    public int repeatedNTimes(int[] nums) {
        int count=0;
        HashSet<Integer> group=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(group.contains(nums[i]))
            {
                count= nums[i];
            }
            group.add(nums[i]);
        }
        return count;
        
    }
}
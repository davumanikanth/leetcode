class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> group=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            {
                group.add(nums[i]);
            }
        int mu=k;
        while(true)
            {
                if(!group.contains(mu))
                {
                    return mu;
                }
                mu+=k;
            }
    }
}
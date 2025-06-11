class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> group=new ArrayList<>();
        Arrays.sort(nums);
        int key=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1])
            {
             
                group.add(nums[i]);
            }
        }
        return group;
        
    }
}
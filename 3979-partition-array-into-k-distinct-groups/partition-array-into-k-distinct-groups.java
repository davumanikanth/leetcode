class Solution {
    public boolean partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length%k!=0) 
        {
            return false;
        }
        HashMap<Integer,Integer> group=new HashMap<>();
         int shouldnotgreat=nums.length/k;
        for(int num:nums)
        {
            group.put(num,group.getOrDefault(num,0)+1);
        
            
        if(group.get(num)>shouldnotgreat)
        {
            return false;
        }
        }
       return true;
    }
}
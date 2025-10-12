class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        HashMap<Integer,Integer> group=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            group.put(nums[i],group.getOrDefault(nums[i],0)+1);

        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:group.entrySet())
        {
            if(entry.getValue()%k==0)
            {
                int x=entry.getKey();
                sum+=entry.getValue()*entry.getKey();
            }
        }
        return sum;
        
    }
}
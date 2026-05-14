class Solution {
    public boolean isGood(int[] nums) {
        HashMap< Integer,Integer> group=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=0)
            {
                return false;
            }
            group.put(nums[i],group.getOrDefault(nums[i],0)+1);
            max=Math.max(nums[i],max);
        }
        int count=0,c=0;
        for(Map.Entry<Integer,Integer> entry:group.entrySet() )
        {
            
            if(entry.getValue()==1)
            {
                count++;
            }
            else if(entry.getValue()==2 && entry.getKey()==max)
            {
                c++;
        }
        }
        if(c==1 && count==max+1-2 )
        {
            return true;
        }
        return false;
    }
}
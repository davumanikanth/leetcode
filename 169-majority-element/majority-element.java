class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int maxvalue=0;
        Map<Integer,Integer> group=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=nums[i];
            int count;
            if(group.containsKey(key))
            {
                count=group.get(key)+1;
            }
            else
            {
                count=1;
            }
            group.put(key,count);
        
        if(count>n/2)
        {
          maxvalue = key;
        }
        }
       return maxvalue; 
    }
}
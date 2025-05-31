class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> group=new HashMap<>();
         int n=nums.length;
         for(int i=0;i<n;i++)
         {
            int key=nums[i];
            int count=0;
            if(group.containsKey(key))
            {
                count=group.get(key)+1;
            }
            else
            {
                count=1;
            }
            group.put(key,count);
         }
         List<Integer> newgroup=new ArrayList<>();

         for(Map.Entry<Integer,Integer> entry: group.entrySet())
         {
            int key=entry.getKey();
            int count=entry.getValue();
            if(count>n/3)
            {
                newgroup.add(key);
            }
            
            }

         
        
       return newgroup; 
    }
}
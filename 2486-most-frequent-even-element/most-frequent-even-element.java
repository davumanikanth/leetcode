class Solution {
    public int mostFrequentEven(int[] nums) {
        Map< Integer,Integer> group=new HashMap<>();
        int n=nums.length;
        
        
        for(int i=0;i<n;i++)
        {
            int key=nums[i];
           
            if(key%2==0 )
            {
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

          

        }
        int maxcount=0;
        int maxvalue=-1;
        for(int i=0;i<n;i++)
        {
            int key=nums[i];
            if (key % 2 == 0 && group.containsKey(key)) {
            int count=group.get(key);
              if(count> maxcount || ( count==maxcount && nums[i] <  maxvalue )) {
                maxcount=count;
                maxvalue=key;
        }
        
    }
        }
    return maxvalue;
    }
}
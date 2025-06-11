class Solution {
    public int[] singleNumber(int[] nums) {
         int n=nums.length;
    Map<Integer,Integer> group=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        int key=nums[i];
        group.put(key,group.getOrDefault(key,0)+1);
    }
    
    int[] number=new int[n];
    int index=0;
    for(Map.Entry<Integer,Integer> entry:group.entrySet())
    {
        if(entry.getValue()==1)
        {
            number[index++]=entry.getKey();
        }
    }
    int[] result=new int[index];
    for(int i=0;i<index;i++)
    {
        result[i]=number[i];
    }

    return result;


    }
}
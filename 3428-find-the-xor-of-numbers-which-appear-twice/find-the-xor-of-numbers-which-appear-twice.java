class Solution {
    public int duplicateNumbersXOR(int[] nums) {
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
        if(entry.getValue()==2)
        {
            number[index++]=entry.getKey();
        }
    }
    int sum=0;
    for(int i=0;i<index;i++)
    {
        sum=sum^number[i];

    }
    if(index==0)
    {
        return 0;
    }
    return sum;
    }
}
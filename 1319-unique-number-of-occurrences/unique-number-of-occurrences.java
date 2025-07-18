class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> group=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            group.put(arr[i],group.getOrDefault(arr[i],0)+1);
        }
        // for(Map.Entry<Integer,Integer> entry:group.entrySet())
        // {

        // }
        int[] values=new int[group.size()];
        int index=0;
        for(Map.Entry<Integer,Integer> entry:group.entrySet())
        {
            values[index++]=entry.getValue();
        }
        Arrays.sort(values);
        for(int i=0;i<index-1;i++)
        {
            if(values[i]==values[i+1])
            {
                return false;
            }
        }
        return true;
        
    }
}
class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer> group=new HashMap<>();
       for(int n:arr)
       {
        group.put(n,group.getOrDefault(n,0)+1);
       }
       int lucky=-1;
       for(int key:group.keySet())
       {
        if(group.get(key)==key)
        {
            lucky=key;
        }

       }
       return lucky;

        
    }
}
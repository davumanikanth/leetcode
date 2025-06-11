class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int n=nums.length;
        Map<Integer, Boolean> newmap=new HashMap<>();
        int[] temp=new int[n];
        int index=0;

        for(int num: nums)
        {
            newmap.put(num,true);
        }
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(!newmap.containsKey(i))
            {
               arr.add(i); 
            }
        }
       

        return arr;
    }
}
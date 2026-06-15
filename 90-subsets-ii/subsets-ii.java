class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        f(0,nums,ans,new ArrayList<>());
        
        return ans;
    }
    public void f(int index,int[] arr,List<List<Integer>> ans,ArrayList<Integer> group)
    {
       
            ans.add(new ArrayList<>(group));
        
       for(int i=index;i<arr.length;i++)
       {
        if(i>index && arr[i]==arr[i-1]) continue;
        group.add(arr[i]);
        f(i+1,arr,ans,group);
        group.remove(group.size()-1);
       

       } 
    }
}
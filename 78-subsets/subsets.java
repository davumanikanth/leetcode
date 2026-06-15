class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans=new ArrayList<>();
    f(0,nums,ans,new ArrayList<>());
    return ans;
         

    }
    public void f(int index,int[] arr,List<List<Integer>> ans,ArrayList<Integer> group)
    {
        if(index==arr.length)
        {
            ans.add(new ArrayList<>(group));
            return;
        }
        group.add(arr[index]);
        f(index+1,arr,ans,group);
        group.remove(group.size()-1);
        f(index+1,arr,ans,group);

    }
}

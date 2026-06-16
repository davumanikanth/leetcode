class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] map=new boolean[nums.length];
        f(nums,map,ans,new ArrayList<>());
        return ans;
        
    }
    public void f(int[] nums,boolean[] map,List<List<Integer>> ans,ArrayList<Integer> group)
    {
        if(group.size()==nums.length) ans.add(new ArrayList<>(group));
        for(int i=0;i<nums.length;i++)
        {
            if(map[i]==false)
            {
             group.add(nums[i]);
             map[i]=true;
             
             f(nums,map,ans,group);
             group.remove(group.size()-1);
             map[i]=false;
            }
            
        }

    }
}
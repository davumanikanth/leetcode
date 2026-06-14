class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        helper(0,target,candidates,res,new ArrayList<>());
        return res;
        
        
    }
    public void helper(int i,int t,int[] c,List<List<Integer>> res,ArrayList<Integer> group)
    {
        if(i==c.length)
        {
            if(t==0)
            {
                res.add(new ArrayList<>(group));
            }
            return;
        }
        if(c[i]<=t)
        {
            group.add(c[i]);
            helper(i,t-c[i],c,res,group);
            group.remove(group.size()-1);
        }
        helper(i+1,t,c,res,group);

    }
}
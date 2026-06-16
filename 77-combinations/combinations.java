class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
        {
            arr[i]=i+1;
            System.out.println(arr[i]);
        }
        f(0,arr,ans,new ArrayList<>(),k);
        return ans;
    
        
    }
    public void f(int index,int[] arr,List<List<Integer>> ans,ArrayList<Integer> group,int k)
    {
        if(group.size()==k)
        {
            ans.add(new ArrayList<>(group));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            group.add(arr[i]);
            f(i+1,arr,ans,group,k);
            group.remove(group.size()-1);
        }
    }
}
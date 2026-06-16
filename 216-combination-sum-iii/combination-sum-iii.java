class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr=new int[9];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i+1;
            System.out.println(arr[i]);
        }
        List<List<Integer>> ans=new ArrayList<>();
        f(0,0,arr,n,ans,new ArrayList<>(),k);
        return ans;
        

        
    }
    public void f(int n,int sum,int[] arr,int target,List<List<Integer>> ans,ArrayList<Integer> group,int k)
    {
         if(sum==target && group.size()==k)
         {
            ans.add(new ArrayList<>(group));
            return ;
         }
         if (sum > target || group.size() > k) {
            return;
        }
         for(int i=n;i<arr.length;i++)
         {
            
            if(sum+arr[i]>target) break;
            group.add(arr[i]);
            f(i+1,sum+arr[i],arr,target,ans,group,k);
            group.remove(group.size()-1);
            
         }
    }
}
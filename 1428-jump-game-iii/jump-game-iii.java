class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited=new boolean[arr.length];

        return dfs(arr,start,visited);
        
        
    }
    public boolean dfs(int[] a,int i,boolean visited[])
    {
        if(i<0 || i>=a.length)
        {
            return false;
        }
        if(visited[i]==true)
        {
            return false;
        }
        if(a[i]==0)
        {
            return true;
        }
       visited[i]=true;
        return dfs(a,i-a[i],visited) || dfs(a,i+a[i],visited);
    }

}
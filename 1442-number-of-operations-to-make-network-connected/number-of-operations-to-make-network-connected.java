class Solution {
    public int makeConnected(int n, int[][] connections) {
         if(connections.length < n - 1) {
            return -1;
        }
        int no=0;
        boolean[] visited=new boolean[n]
;       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int[] edges:connections)
        {
            int u=edges[0];
            int v=edges[1];
            adj.get(u).add(v);
             adj.get(v).add(u);

            
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                dfs(visited,adj,i);
                count++;
            }
        }

        
        return count-1;
        
    }
    public void dfs(boolean[] visited,ArrayList<ArrayList<Integer>> adj,int src)
    {
        visited[src]=true;
        for(int num:adj.get(src))
        {
            if(!visited[num]){
            dfs(visited,adj,num);
            }
        }
    }

}
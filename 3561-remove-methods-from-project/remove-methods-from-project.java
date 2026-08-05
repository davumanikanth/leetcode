class Solution {
    public static void dfs(boolean[] visited,ArrayList<ArrayList<Integer>> adj,int k)
    {
        if (visited[k]) return;
        visited[k]=true;
        for(int node:adj.get(k))
        {
        
            dfs(visited,adj,node);
        }
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }      
        int max=0;  
        for(int i=0;i<invocations.length;i++)
        {
            int u=invocations[i][0];
            int v=invocations[i][1];
            
            adj.get(u).add(v);
            
        }
        boolean[] visited=new boolean[n];
        dfs(visited,adj,k);
        boolean flag=false;
        ArrayList<Integer> group=new ArrayList<>();
        for(int i=0;i<invocations.length;i++)
        {
            int u=invocations[i][0];
            int v=invocations[i][1];
            
            
            if((visited[u]==false && visited[v]==true) )
            {
               flag=true;
               break;
            }

        }
        if(flag==true)
        {
            for(int i=0;i<visited.length;i++)
            {
                group.add(i);
            }
            
        }
        else
        {
            for(int i=0;i<visited.length;i++)
            {
                if(visited[i]==false)
                {
                    group.add(i);
                }
            }
        }
        

        return group;


        


    }
}
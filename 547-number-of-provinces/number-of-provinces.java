class Solution {
    public int findCircleNum(int[][] isConnected) {
 
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

    /// creating an empty list
    for(int i=0;i<isConnected.length;i++)
    {
        adj.add(new ArrayList<>());
    }

  //collectin the adj list

    for(int i=0;i<isConnected.length;i++)
    {
        for(int j=0;j<isConnected.length;j++)
        {
            if(isConnected[i][j]==1 && i!=j)
            {
                adj.get(i).add(j);
                adj.get(j).add(i);
                
            }
        }
    }

   boolean[] visited=new boolean[isConnected.length];
   int count=0;

   int n=isConnected.length;
   for(int i=0;i<n;i++)
   {
    if(visited[i]==false)
    {
        count++;
        dfs(i,adj,visited);

    }
   }
   

       
    return count;


        
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited )
    {
        visited[node]=true;
        for(int con:adj.get(node))
        {
            if(visited[con]==false)
            {
            dfs(con,adj,visited);
            }
        }
    }
    public void bfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited)
    {
        Queue<Integer> q=new LinkedList<>();
         q.offer(node);
         visited[node]=true;

         while(!q.isEmpty())
         {
            int rem=q.poll();
            for(int con:adj.get(node))
            {
                if(visited[con]==false)
                {
                    visited[con]=true;
                    q.offer(con);
                }
            }
         }

    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        boolean[] visited=new  boolean[graph.length];
        for(int i=0;i<color.length;i++)
        {
             
        
    
      if(visited[i]==false)
      {
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        visited[i]=true;
        color[i]=0;
        while(!q.isEmpty())
        {
            
            int node=q.remove();
            for(int nei:graph[node] )
            {
               
                    if(visited[nei]==false)
                    {
                        visited[nei]=true;
                        color[nei]=1-color[node];
                        q.add(nei);

                    }
                    else
                    {
                        if(color[node]==color[nei])
                        {
                            return false;
                        }
                    }
                

            }

        }
    }
        }
                return true;

    }
}


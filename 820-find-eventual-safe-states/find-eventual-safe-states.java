class Solution {
    public List<Integer> eventualSafeNodes(int[][] edges) {
        int n=edges.length;
        int[] indegree=new int[edges.length];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<edges.length;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            for(int num:edges[i])
            {
                adj.get(num).add(i);

            }
        }
        


        for(int i=0;i<edges.length;i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                int nei=adj.get(i).get(j);
                indegree[nei]++;
            }
        }


        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }

       ArrayList<Integer> result=new ArrayList<>();
        while(!q.isEmpty())
        {
            int node=q.remove();
            result.add(node);
            for(int i=0;i<adj.get(node).size();i++)
            {
                int ni=adj.get(node).get(i);
                indegree[ni]--;
                if(indegree[ni]==0)
                {
                    q.add(ni);
                }
            }
        
        }
        Collections.sort(result);
        return result; 
    }
}
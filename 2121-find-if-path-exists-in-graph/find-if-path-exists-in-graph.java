class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            adj.add(new ArrayList<>());
        }

        // Build graph
        for(int[] edge : edges)
        {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);   // undirected graph
        }

        boolean[] visited = new boolean[n];

        return dfs(adj, visited, source, destination);
    }

    public boolean dfs(ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited,
                       int curr,
                       int destination)
    {
        if(curr == destination)
        {
            return true;
        }

        visited[curr] = true;

        for(int neighbor : adj.get(curr))
        {
            if(!visited[neighbor])
            {
                if(dfs(adj, visited, neighbor, destination))
                {
                    return true;
                }
            }
        }

        return false;
    }
}
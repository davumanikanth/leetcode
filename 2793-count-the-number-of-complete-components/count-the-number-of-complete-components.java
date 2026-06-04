class Solution {

    public int countCompleteComponents(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (!vis[i]) {

                ArrayList<Integer> component = new ArrayList<>();

                dfs(i, adj, vis, component);

                int size = component.size();
                boolean complete = true;

                for (int node : component) {
                    if (adj.get(node).size() != size - 1) {
                        complete = false;
                        break;
                    }
                }

                if (complete) count++;
            }
        }

        return count;
    }

    private void dfs(int node,
                     ArrayList<ArrayList<Integer>> adj,
                     boolean[] vis,
                     ArrayList<Integer> component) {

        vis[node] = true;
        component.add(node);

        for (int nei : adj.get(node)) {
            if (!vis[nei]) {
                dfs(nei, adj, vis, component);
            }
        }
    }
} 
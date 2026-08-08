class Solution {
    int[] parent;
    int[] rank;

    public int find(int n) {
        if (n == parent[n]) {
            return n;
        }

        return parent[n] = find(parent[n]);
    }

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa == pb) {
            return;
        }

        if (rank[pa] > rank[pb]) {
            parent[pb] = pa;
        } 
        else if (rank[pa] < rank[pb]) {
            parent[pa] = pb;
        } 
        else {
            parent[pb] = pa;
            rank[pa]++;
        }
    }

    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;

        parent = new int[n + 1];
        rank = new int[n + 1];

        // Initially, every node is its own parent
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        for (int[] e : edges) {

            int u = e[0];
            int v = e[1];

            // Already in the same component -> cycle
            if (find(u) == find(v)) {
                return new int[]{u, v};
            }

            union(u, v);
        }

        return new int[]{};
    }
}
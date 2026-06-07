class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < vals.length; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int ans = Integer.MIN_VALUE;

        for (int node = 0; node < vals.length; node++) {

            ArrayList<Integer> neighbors = new ArrayList<>();

            for (int nbr : adj.get(node)) {
                if (vals[nbr] > 0) {
                    neighbors.add(vals[nbr]);
                }
            }

            neighbors.sort(Collections.reverseOrder());

            int sum = vals[node];

            for (int i = 0; i < Math.min(k, neighbors.size()); i++) {
                sum += neighbors.get(i);
            }

            ans = Math.max(ans, sum);
        }

        return ans;
    }
}
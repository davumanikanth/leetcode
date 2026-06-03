class Solution {

    Map<Integer, List<Integer>> graph = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        buildGraph(root, null);

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.offer(target.val);
        visited.add(target.val);

        int distance = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            if (distance == k) {
                return new ArrayList<>(q);
            }

            for (int i = 0; i < size; i++) {

                int curr = q.poll();

                for (int neighbor : graph.get(curr)) {

                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        q.offer(neighbor);
                    }
                }
            }

            distance++;
        }

        return new ArrayList<>();
    }

    private void buildGraph(TreeNode node, TreeNode parent) {

        if (node == null) return;

        graph.putIfAbsent(node.val, new ArrayList<>());

        if (parent != null) {

            graph.putIfAbsent(parent.val, new ArrayList<>());

            graph.get(node.val).add(parent.val);
            graph.get(parent.val).add(node.val);
        }

        buildGraph(node.left, node);
        buildGraph(node.right, node);
    }
}
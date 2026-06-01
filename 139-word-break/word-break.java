class Solution {

    class Node {
        Node[] children = new Node[26];
        boolean eow;
    }

    Node root = new Node();

    public void insert(String word) {
        Node curr = root;

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public boolean search(String word) {
        Node curr = root;

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow;
    }

    public boolean solve(String s, Boolean[] dp) {
        if (s.length() == 0) {
            return true;
        }

        if (dp[s.length()] != null) {
            return dp[s.length()];
        }

        for (int i = 1; i <= s.length(); i++) {
            String firstPart = s.substring(0, i);
            String secondPart = s.substring(i);

            if (search(firstPart) && solve(secondPart, dp)) {
                return dp[s.length()] = true;
            }
        }

        return dp[s.length()] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        for (String word : wordDict) {
            insert(word);
        }

        Boolean[] dp = new Boolean[s.length() + 1];

        return solve(s, dp);
    }
}
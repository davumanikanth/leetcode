class Solution {
    class TrieNode {
        TrieNode[] children;
        int index;
        int length;
        TrieNode() {
            children = new TrieNode[26];
            index = -1;
            length = Integer.MAX_VALUE;
        }
    }
    class Trie {
        TrieNode root;
        Trie() {
            root = new TrieNode();
        }     
        public void insert(String s, int ind, int len) {

            TrieNode curr = root;

          
            if (len < curr.length) {
                curr.length = len;
                curr.index = ind;
            }

            for (int i = len - 1; i >= 0; i--) {

                int idx = s.charAt(i) - 'a';

                if (curr.children[idx] == null) {
                    curr.children[idx] = new TrieNode();
                }

                curr = curr.children[idx];

               
                if (len < curr.length) {

                    curr.length = len;
                    curr.index = ind;
                }
            }
        }     
        public int prefix(String s) {

            TrieNode node = root;

            int ans = root.index;

            for (int i = s.length() - 1; i >= 0; i--) {

                int idx = s.charAt(i) - 'a';

                if (node.children[idx] == null) {
                    break;
                }

                node = node.children[idx];

                ans = node.index;
            }

            return ans;
        }
    }
    public int[] stringIndices(String[] wordsContainer,
                               String[] wordsQuery) {
        Trie t = new Trie();      
        for (int i = 0; i < wordsContainer.length; i++) {
            t.insert( wordsContainer[i],i,wordsContainer[i].length()
            );
        }
        int[] ans = new int[wordsQuery.length];
   for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = t.prefix(wordsQuery[i]);
        }
        return ans;
    }
}
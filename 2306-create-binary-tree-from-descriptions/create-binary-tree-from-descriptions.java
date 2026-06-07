/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> group = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for(int[] des:descriptions)
        {
            int parentVal=des[0];
            int childVal=des[1];
            int isLeft=des[2];
            group.putIfAbsent(parentVal,new TreeNode(parentVal));
            group.putIfAbsent(childVal,new TreeNode(childVal));
            TreeNode parent=group.get(parentVal);
            TreeNode child=group.get(childVal);
            
            if(isLeft == 1) {
                parent.left = child;
            } else {
                parent.right = child;
            }
            children.add(childVal);

        }
        for(Map.Entry<Integer,TreeNode> entry:group.entrySet())
        {
            if(!children.contains(entry.getKey()))
            {
                TreeNode ch= entry.getValue();
                return ch;
            }

        }
        return null;

        
    }
}
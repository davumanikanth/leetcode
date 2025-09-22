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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> group=new ArrayList<>();
        postorder(root,group);
        return group;
        
    }
    public void postorder(TreeNode node, List<Integer>  group)
    {
        if(node==null)
        {
            return ;
        }
        postorder(node.left,group);
        postorder(node.right,group);
        group.add(node.val);
    }
}
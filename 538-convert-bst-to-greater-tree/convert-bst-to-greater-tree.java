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
    int prev=0;
    public TreeNode convertBST(TreeNode node) {
        inorderReverse(node);
        return node;
    }
    public void  inorderReverse(TreeNode root)
    {
        if(root==null) return;
        inorderReverse(root.right);
        prev+=root.val;

        
    
            root.val=prev;
    
        inorderReverse(root.left);
    }
}
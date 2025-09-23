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
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        
        int lh=height(root.left);
        int rh=height(root.right);
        int diameter=lh+rh;
        int leftsub=diameterOfBinaryTree(root.left);
        int rightsub=diameterOfBinaryTree(root.right);
        int ans=Math.max(diameter,Math.max(leftsub,rightsub));
        return ans;


        
    }
    public int height(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int leftheight=height(node.left);
        int rightheight=height(node.right);
        return 1+Math.max(leftheight,rightheight);
    }
}
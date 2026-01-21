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
    int count=0;
    int result=0;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
        inorder(root);
        return result;
    }
    void inorder(TreeNode node)
    {
        if(node==null) return;
        inorder(node.left);
        count--;
        if(count==0)
        {
            result=node.val;
        }
        if(count<0) return ;
        inorder(node.right);


    }
}
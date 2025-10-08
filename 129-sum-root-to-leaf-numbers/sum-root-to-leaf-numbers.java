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
    private int sum=0;
    public int sumNumbers(TreeNode root) {
        
        
        StringBuilder sb=new StringBuilder();
        sb.append(root.val);
        helper(root, sb);

        return sum;
        
    }
    public void helper(TreeNode root,StringBuilder sb)
    {
      if(root==null)
      {
        return;
      }

      if(root.left==null && root.right==null)
      {
        sum+=Integer.parseInt(sb.toString());  
      }
      if(root.left!=null)
      {
      helper(root.left,new StringBuilder(sb).append(root.left.val));
      }
      if(root.right!=null)
      {
      helper(root.right,new StringBuilder(sb).append(root.right.val));
      }
    }
}
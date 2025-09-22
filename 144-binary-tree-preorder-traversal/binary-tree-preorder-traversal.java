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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> group=new ArrayList<>();
        preorder(root,group);
        return group;       
        
        
    }
    public void preorder(TreeNode node,List<Integer> group)
    {
        if(node==null)
        {
            return ;
        }
        group.add(node.val);
        preorder(node.left,group);
        preorder(node.right,group);
    }
}
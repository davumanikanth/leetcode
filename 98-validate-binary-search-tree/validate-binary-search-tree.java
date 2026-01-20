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
    public boolean isValidBST(TreeNode root) {
        List<Integer> group=new ArrayList<>();
        inorder(root,group);
        for(int i=1;i<group.size();i++)
        {
            if(group.get(i-1)>=group.get(i))
            {
                return false;
            }
        }
        return true;
    }
    public void  inorder(TreeNode node,List<Integer> group)
    {
        if(node==null)
        {
            return;

        }

        inorder(node.left,group);
        group.add(node.val);
        inorder(node.right,group);
    }
}
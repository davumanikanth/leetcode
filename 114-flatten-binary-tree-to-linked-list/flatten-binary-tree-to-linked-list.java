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
    public void flatten(TreeNode root) {
        if(root==null)
        {
            return;
        }
        List<Integer> group=new ArrayList<Integer>();
        preorder(root,group);
        cleartree(root);
        TreeNode temp=root;
        temp.val=group.get(0);
        for(int i=1;i<group.size();i++)
        {
            temp.left=null;
            temp.right=new TreeNode(group.get(i));
            temp=temp.right;
        }
        
    }
    public void preorder(TreeNode root,List<Integer> group)
    {
        if(root==null)
        {
            return ;
        }
        group.add(root.val);
        preorder(root.left,group);
        preorder(root.right,group);
    }
    public void cleartree(TreeNode tree)
    {
        if(tree==null)
        {
            return ;
        }
      cleartree(tree.left);
        cleartree(tree.right);

        tree.right=null;
        tree.left=null;
       
    }
}
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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> group=new ArrayList<>();
        inorder(root,group);

        //now we need to form the tree of rightest tree;
        int index=0;
        TreeNode tree=new TreeNode(0);
        TreeNode temp=tree;
        for(int i=0;i<group.size();i++)
        {
            temp.right=new TreeNode(group.get(i));
            temp=temp.right;

        }
        return tree.right;



        
    }
    public void inorder(TreeNode node,List<Integer> group)
    {
        if(node==null)
        {
            return ;
        }
        inorder(node.left,group);
        group.add(node.val);
        inorder(node.right,group);
    }
}
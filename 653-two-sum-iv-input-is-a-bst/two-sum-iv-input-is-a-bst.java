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

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> group=new HashSet<>();
        inorder(root,k,group);
        if(count==1) return true;
        else return false;

        

    }
    public void inorder(TreeNode node,int k,HashSet<Integer> group)
    {
        if(node==null ) return;
        inorder(node.left,k,group);
        if(group.contains(k- node.val))
        {
            count=1;
            
        }
        group.add(node.val);
        inorder(node.right,k,group);
    }
}
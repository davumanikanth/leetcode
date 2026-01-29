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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> group=new ArrayList<>();
        inorder(root1,group);
        inorder(root2,group);
        Collections.sort(group);
        return group;
        

    }
    public void inorder(TreeNode root,ArrayList<Integer> group)

    {
        if(root==null) return;
        inorder(root.left,group);
        group.add(root.val);
        inorder(root.right,group);

    }
}
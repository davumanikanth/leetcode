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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> tree=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append(root.val);
        dfs(root,tree,sb);
        return tree;
        


    }
    public static void dfs(TreeNode root,List<String> result,StringBuilder sb)
    {
        if(root.left==null && root.right==null)
        {
            result.add(sb.toString());
            return;
        }
        if(root.left!=null)
        {
            dfs(root.left,result,new StringBuilder(sb).append("->").append(root.left.val));
        }
        if(root.right!=null)
        {
            dfs(root.right,result,new StringBuilder(sb).append("->").append(root.right.val));
        }
    }
}
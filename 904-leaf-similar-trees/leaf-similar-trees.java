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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
        {
            return true;
        }
        List<Integer> leaf1=new ArrayList<>();
        List<Integer> leaf2=new ArrayList<>();
        dfs(root1,leaf1);
        dfs(root2,leaf2);
        return  leaf1.equals(leaf2);
    
        
    }
    public void dfs(TreeNode node,List<Integer> group)
    {
        if(node==null)
        {
            return;
        }

        if(isLeaf(node) )
        {
            group.add(node.val);
            return;
        }
        dfs(node.left,group);
        dfs(node.right,group);


      
    }
    public boolean isLeaf(TreeNode node)
    {
        if(node.left==null && node.right==null)
        {
            return true;
        }
        return false;
    }
}
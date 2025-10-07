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
    public int sumRootToLeaf(TreeNode root) {
        List<String> group=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append(root.val);
        helper(root,group,sb);
        // int sum=0;
        // for(int i=0;i<group.size();i++)
        // {
        //     sum+=Integer.parseInt(group.get(i),2);

        // }
        return sum;
   
    }
    
    public void helper(TreeNode node,List<String> group,StringBuilder sb)
    {
        if(node.left==null && node.right==null)
        {
            sum+=Integer.parseInt(sb.toString(),2);
        }
        if(node.left!=null)
        {
            helper(node.left,group,new StringBuilder(sb).append(node.left.val));
        }
        if(node.right!=null)
        {
            helper(node.right,group,new StringBuilder(sb).append(node.right.val));
        }
    }  

}
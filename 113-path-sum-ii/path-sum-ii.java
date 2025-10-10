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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum)   
    {
       
        List<List<Integer>> group=new ArrayList<>();
        
        helper(root,0,group,targetSum,new ArrayList<>());
        return group;
        
        
        
    }
    public void helper(TreeNode root,int sum,List<List<Integer>> group,int targetSum,List<Integer> currpath)
    {
         
        if(root==null)
        {
             return ;
        }
        sum+=root.val;
        
        currpath.add(root.val);
        if(root.left==null && root.right==null && sum==targetSum)
        {
           group.add(new ArrayList<>(currpath));
            
        }
       
        helper(root.left,sum,group,targetSum,currpath);
        helper(root.right,sum,group,targetSum,currpath);
        currpath.remove(currpath.size()-1);

    }
}
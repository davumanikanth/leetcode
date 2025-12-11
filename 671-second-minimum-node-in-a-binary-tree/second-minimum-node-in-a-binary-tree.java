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
    public int findSecondMinimumValue(TreeNode root)
    {
        

        Set<Integer> group=new TreeSet<>();

       
        inorder(root,group);
        if(group.size()<2)
        {
            return -1;
        }
        
        
                  List<Integer> group2=new ArrayList<>(group);

            return group2.get(1);
        
        
     }
    public void inorder(TreeNode node,Set<Integer> group)
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
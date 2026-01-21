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

    public int kthSmallest(TreeNode root, int k) {
        int sum=0;
        PriorityQueue<Integer> group=new PriorityQueue<>(Collections.reverseOrder());

        inorder(root,k,group);
       
        
        return group.peek();
    }
    public void inorder(TreeNode node,int k,PriorityQueue<Integer> group)
    {
        if(node==null) return;
        inorder(node.left,k,group);
        group.add(node.val);

        while(group.size()>k)
        {
            group.poll();
        }
        inorder(node.right,k,group);
    }

}
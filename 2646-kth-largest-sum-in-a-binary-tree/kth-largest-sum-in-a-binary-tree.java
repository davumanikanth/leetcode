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
    public long kthLargestLevelSum(TreeNode root, int k) {
        
        Queue<TreeNode > q=new LinkedList<>();
        PriorityQueue<Long> p=new PriorityQueue<>();
        q.add(root);
        while(!q.isEmpty())
        {
            long sum=0;
            int level=q.size();
            for(int i=0;i<level;i++)
            {
                TreeNode rem=q.remove();
                sum+=rem.val;
                if(rem.left!=null) q.add(rem.left);
                if(rem.right!=null) q.add(rem.right);
                
            }
            p.add(sum);
            if(p.size()>k)
            {
                p.remove();
            }
        }
        if(p.size()<k) return -1;
        return p.peek();

    }
}
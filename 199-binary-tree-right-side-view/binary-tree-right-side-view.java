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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> group=new ArrayList<>();
        if(root==null)
        {
            return group;
        }
        while(!q.isEmpty())
        {
            int level=q.size();
            ArrayList<Integer> sub=new ArrayList<>();
            for(int i=0;i<level;i++)
            {
                TreeNode rem=q.poll();
                sub.add(rem.val);
                if(rem.left!=null)
                {
                    q.offer(rem.left);
                }
                if(rem.right!=null)
                {
                    q.offer(rem.right);
                }
                
                
            }
            group.add(sub.get(sub.size()-1));
        }
        return group;
    }
}
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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
       List<Integer> group=new ArrayList<>();
        if(root==null)
        {
            return group;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
            int maxval=Integer.MIN_VALUE;
            for(int i=0;i<level;i++)
            {
               TreeNode rem=queue.remove();
                maxval=Math.max(rem.val,maxval);
                if(rem.left!=null)
                {
                    queue.add(rem.left);
                }
                if(rem.right!=null)
                {
                    queue.add(rem.right);
                    
                }


            }
            group.add(maxval);

        }
        return group;
        
    }
}
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
    public int deepestLeavesSum(TreeNode root) {
      Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        {
            return 0;
        }
        queue.add(root);
        int sum=0;
        while(!queue.isEmpty())
        {
            int level=queue.size();
            sum=0;
            for(int i=0;i<level;i++)
            {
               TreeNode rem=queue.remove();
               sum+=rem.val;
                if(rem.left!=null)
                {
                    queue.add(rem.left);
                }
                if(rem.right!=null)
                {
                    queue.add(rem.right);
                    
                }


            }

        }
        return sum;
          
    }
}
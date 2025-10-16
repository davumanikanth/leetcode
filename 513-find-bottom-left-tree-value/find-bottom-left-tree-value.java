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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        int last=0;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
           
            List<Integer> sublist=new LinkedList<>();
            for(int i=0;i<level;i++)
            {
               TreeNode rem=queue.remove();
                if(i==0)
                {
                    last=rem.val;
                }
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
       return last;
        
    }
}
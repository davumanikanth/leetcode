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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        {
            return 0;
        }
        queue.add(root);
        int level=1;
        int maxsum=root.val;
        int maxlevel=1;
        while(!queue.isEmpty())
        {
            int qs=queue.size();
            int currsumlevel=0;
            for(int i=0;i<qs;i++)
            {
               TreeNode rem=queue.remove();
                currsumlevel+=rem.val;
                if(rem.left!=null)
                {
                    queue.add(rem.left);
                }
                if(rem.right!=null)
                {
                    queue.add(rem.right);
                    
                }


            }
            if(currsumlevel>maxsum)
            {
                maxsum=currsumlevel;
                maxlevel=level;
            }
            level++;

        }
        return maxlevel;
        
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(cloned);
        while(!queue.isEmpty())
        {
            int level=queue.size();
            for(int i=0;i<level;i++)
            {
                TreeNode tree=queue.poll();
                if(tree.val==target.val)
                {
                    return tree;
                }
                if(tree.left!=null)
                {
                    queue.offer(tree.left);

                }
                if(tree.right!=null)
                {
                    queue.offer(tree.right);
                }
            }

        }
      
       return null;
    }
}
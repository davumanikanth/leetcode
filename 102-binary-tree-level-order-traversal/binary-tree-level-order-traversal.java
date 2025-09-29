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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> group=new ArrayList<List<Integer>>();
        if(root==null)
        {
            return group;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0;i<level;i++)
            {
               TreeNode rem=queue.remove();
                sublist.add(rem.val);
                if(rem.left!=null)
                {
                    queue.add(rem.left);
                }
                if(rem.right!=null)
                {
                    queue.add(rem.right);
                    
                }


            }
            group.add(sublist);

        }
        return group;
        
    }
}
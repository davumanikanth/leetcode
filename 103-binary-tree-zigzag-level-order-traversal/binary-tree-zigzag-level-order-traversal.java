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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> group=new ArrayList<List<Integer>>();
        int count=0;
        if(root==null)
        {
            return group;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            int qsize=queue.size();
            List<Integer> sublist=new ArrayList<>();
            for(int i=0;i<qsize;i++)
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
            if(count%2==0)
            {
                group.add(sublist);
            }
            else
            {
                Collections.reverse(sublist);
                group.add(sublist);

            }
            count++;

        }
        return group;
        
    }
}
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> group=new ArrayList<List<Integer>>();
      Queue<TreeNode> queue=new LinkedList<>();
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
        group.add(sublist);
        
    }
    Collections.reverse(group);
    return group;

    }
}
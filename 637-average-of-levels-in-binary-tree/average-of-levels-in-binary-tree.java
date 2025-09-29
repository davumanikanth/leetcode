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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> group=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();

        if(root==null)
        {
            return group;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            
            double sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode tree=queue.remove();
                 sum+=tree.val;
               
              
                if(tree.left!=null)
                {
                    queue.add(tree.left);

                }
                if(tree.right!=null)
                {
                    queue.add(tree.right);
                }

            }
            group.add(sum/size);
        }
        return group;

        
    }
}
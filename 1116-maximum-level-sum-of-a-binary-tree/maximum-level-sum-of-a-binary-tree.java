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
        if(root==null)
        {
            return 0;

        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int size=1;
        int maxlevel=1;
        int maxsum=root.val;
        while(!q.isEmpty())
        {
            
            int sum=0;
            int level=q.size();
           
            for(int i=0;i<level;i++)
            {
                 TreeNode curr=q.remove();
                 sum+=curr.val;
                 if(curr.left!=null) q.add(curr.left);
                 if(curr.right!=null) q.add(curr.right);

                
            }
            

            if(sum > maxsum) 
            {
                maxlevel=size;
                maxsum=sum;
            }
            
               
            
            size++;
            

        }
        return maxlevel;
        
    }
}
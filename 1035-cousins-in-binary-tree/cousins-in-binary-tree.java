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
    public boolean isCousins(TreeNode root, int x, int y) {
        int x_depth=height(root,x);
        int y_depth=height(root,y);


        TreeNode x_parent=parent(root,x);
        TreeNode y_parent=parent(root,y);
        

        if(x_depth==-1 || y_depth==-1 || x_depth!=y_depth  )
        {
            return false;
        }
        if(x_parent==null && y_parent==null )
        {
        return false;
        }
        else if(x_parent!=y_parent)
        {
            return true;
        }
        else
        {
        return false;
        }
        
    }
    public int height(TreeNode node, int value1)
    {
        if(node==null)
        {
            return -1;
        }
        Queue<TreeNode> group=new LinkedList<>();
        int depth=0;
        group.add(node);
        while(!group.isEmpty())

        {


            int level=group.size();
            for(int i=0;i<level;i++)
            {
                            TreeNode curr=group.poll();
                            if(curr.val== value1)
                            {
                                return depth;
                            }



                            if(curr.left!=null) group.add(curr.left);
                            if(curr.right!=null) group.add(curr.right);



            }
            depth++;
        }
             return -1;

    }
    public TreeNode parent(TreeNode node,int value1)
    {
        if(node==null )
        {
            return null; 
        }
        if(node.val==value1)
        {
            return null;
        }
        if((node.left!=null && node.left.val==value1 ) || node.right!=null && node.right.val== value1)
        {
            return node;
        }
        TreeNode left=parent(node.left,value1);
        if(left!=null)
        {
           return left;
        }
        return parent(node.right,value1);
    }
}
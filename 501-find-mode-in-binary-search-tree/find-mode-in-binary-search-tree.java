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
    public int[] findMode(TreeNode root) {
        
       
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        HashMap<Integer,Integer> group1=new HashMap<>();
        while(!q.isEmpty())
        {
            int level=q.size();
            for(int i=0;i<level;i++)
            {
            TreeNode temp=q.remove();
            group1.put(temp.val,group1.getOrDefault(temp.val,0)+1);
            if(temp.left!=null)
            {               
                 q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }



            }
        }
        int maxfreq=0;
        for(int num:group1.keySet())
        {
            maxfreq=Math.max(maxfreq,group1.get(num));
        }
        List<Integer> ans=new ArrayList<>();
        for(int num:group1.keySet())
        {
            if(maxfreq==group1.get(num))
            {
                ans.add(num);
            }
        }
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            result[i]=ans.get(i);
        }
        

        return result;
    }
}
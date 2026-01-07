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
    static long totalsum;
    static long maxproduct;
    static final int MOD=1_000_000_007;
    public int maxProduct(TreeNode root) {
        maxproduct=0;
        totalsum=bfs(root);
        dfsmaxproduct(root);
        return (int)(maxproduct%MOD);
        
        

        
    }
    public long bfs(TreeNode node)
    {
            if(node==null)
            {
                return 0;
            }
            return node.val + bfs(node.left) + bfs(node.right);
    }
    public long dfsmaxproduct(TreeNode node)
    {
            if(node==null)
            {
                return 0;
            }
            long left=dfsmaxproduct(node.left);
            long right=dfsmaxproduct(node.right);
            long subtreesum=node.val+left+right;
            maxproduct=Math.max(maxproduct,subtreesum*(totalsum -subtreesum));

            return subtreesum;
    }
}
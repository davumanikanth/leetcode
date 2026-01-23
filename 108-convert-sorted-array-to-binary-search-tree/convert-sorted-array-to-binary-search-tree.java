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
    public TreeNode sortedArrayToBST(int[] nums) {
        return b(nums,0,nums.length-1);
        
    }
    public TreeNode b(int[] arr,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=b(arr,start,mid-1);
        node.right=b(arr,mid+1,end);
        return node;
    }
}
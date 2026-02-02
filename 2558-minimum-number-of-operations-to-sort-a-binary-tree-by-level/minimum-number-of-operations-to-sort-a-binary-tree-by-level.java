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
    public int minimumOperations(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       int kojasum=0;
       while(!q.isEmpty())
       {

            int level=q.size();
            int[] arr=new int[level];
           for(int i=0;i<level;i++)
           {
              TreeNode rem=q.remove();
              arr[i]=rem.val;
              if(rem.left!=null) q.add(rem.left);
              if(rem.right!=null) q.add(rem.right);

           }
         kojasum+=minnoofswap(arr);
           
       }
        return kojasum;
    }
    public int minnoofswap(int[] arr)
    {
        int[] temp=arr.clone();
        HashMap<Integer,Integer> group=new HashMap<>();
        Arrays.sort(temp);
        for(int i=0;i<arr.length;i++)
        {
            group.put(arr[i],i);

        }
        int swap=0;
        for(int i=0;i<arr.length;i++)
        {
            if(temp[i]!=arr[i])
            {
                int index=group.get(temp[i]);

                int temp1=arr[index];
                arr[index]=arr[i];
                arr[i]=temp1;
                 

                 group.put(arr[index],index);
                 group.put(arr[i],i);
                 swap++;
            }
        }
        return swap;

    }
    
         
    
}
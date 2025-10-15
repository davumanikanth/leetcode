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
 class Tuple
 {
    TreeNode node;
    int row;
    int col;
    
    public Tuple(TreeNode node,int row,int col)
    {
        this.node=node;
        this.row=row;
        this.col=col;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<Tuple>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty())
        {
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.row;
            int y=tuple.col;

            map.putIfAbsent(y, new TreeMap<>());
            map.get(y).putIfAbsent(x, new PriorityQueue<>());
            map.get(y).get(x).offer(node.val);


            if(node.left!=null)
            {
                q.add(new Tuple(node.left,x+1,y-1));

            }

            if(node.right!=null)
            {
                q.add(new Tuple(node.right,x+1,y+1));
            }



        }

        List<List<Integer>> list=new ArrayList<>();

        for(TreeMap<Integer,PriorityQueue<Integer>> result: map.values())

        {
            List<Integer> collist=new ArrayList<>();
            for(PriorityQueue<Integer> pq:result.values())
            {
                while(!pq.isEmpty())
                {
                    collist.add(pq.poll());
                }
            }
                list.add(collist);

        }

return list;
        
    }
}
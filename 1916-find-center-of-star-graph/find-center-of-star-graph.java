class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int v=edges[i][0];
            int u=edges[i][1];
            adj.get(v).add(u);
            adj.get(u).add(v);

        }
        int max=0;
        int center=0;
        for(int i=1;i<=n;i++)
        {
            if(max<adj.get(i).size())
            {
                max=adj.get(i).size();
                center=i;
            }

        }
        return center;
        
    }
}
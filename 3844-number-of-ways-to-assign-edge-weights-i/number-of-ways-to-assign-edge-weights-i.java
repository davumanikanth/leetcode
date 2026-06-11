class pair
{
    int first;
    int second;
    pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
  
    public int assignEdgeWeights(int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int maxNode=0;
        for(int[] e : edges)
{
    maxNode = Math.max(maxNode, Math.max(e[0], e[1]));
}
        for(int i=0;i<=maxNode;i++)
        {
            adj.add(new ArrayList<>());
        }
    boolean[] visited=new boolean[maxNode+1];
       for(int[] e:edges)
       {
         int u=e[0];
         int v=e[1];
         adj.get(u).add(v);
         adj.get(v).add(u);

       }
       Queue<pair> q=new LinkedList<>();
       int time=0;
       q.add(new pair(1,0));
       while(!q.isEmpty())
       {
         pair rem=q.remove();
         int node=rem.first;
         visited[node]=true;
         int t=rem.second;
         time=Math.max(time,t);
         for(int n:adj.get(node))
         {
            if(visited[n]==false)
            {
                q.add(new pair(n,t+1));
            }

         }

       }
       System.out.println(time);
       return (int)pow(2,time-1);

        
    }
    static final long mod = 1000000007L;
    private long pow(long base, int exp) {
        long res = 1;
        while (exp > 0) {
            if (exp % 2 > 0)
            {
                res = res * base % mod;
            }
            base = base * base % mod;
            exp /= 2;
        }
        return res;
    }
}
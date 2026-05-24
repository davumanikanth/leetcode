class Solution {
    class pair
    {
        int dist;
        int node;
        pair(int dist,int node)
        {
            this.dist=dist;
            this.node=node;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] e:times)
        {
            int u=e[0];
            int v=e[1];
            int w=e[2];
            adj.get(u).add(new pair(w,v));
            
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((x,y)->x.dist-y.dist);
        int[] distance=new int[n+1];

        for(int i=1;i<=n;i++)
        {
            distance[i]=(int)(1e9);
        }

        pq.add(new pair(0,k));

        distance[k]=0;

        while(!pq.isEmpty())
        {
            int dis=pq.peek().dist;
            int node=pq.peek().node;
            pq.remove();
            for(int i=0;i<adj.get(node).size();i++)
            {
                pair rem=adj.get(node).get(i);
                int adjdist=rem.dist;
                int adjnode=rem.node;
                if(dis+adjdist <distance[adjnode])
                {
                    distance[adjnode]=dis+adjdist;
                    pq.add(new pair(distance[adjnode],adjnode));
                }

            }
        }
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if(distance[i]==(int)(1e9))
            {
                return -1;
            }
           ans=Math.max(ans,distance[i]);
        }

        return ans;

        
    }
}
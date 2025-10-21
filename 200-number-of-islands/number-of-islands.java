class Pair

{
    int first;
    int second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
       
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean[][] visited=new boolean[n][m];
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<m;col++)
            {
                if(visited[row][col]==false && grid[row][col]=='1')
                {
                    count++;
                    // bfs(row,col,visited,grid);
                    dfs(row,col,visited,grid);
                }

            }
        }
        return count;
        
    }
    public void dfs(int ro,int co,boolean[][] visited,char[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        visited[ro][co]=true;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};



            for(int i=0;i<4;i++)
            {
                int nrow=ro+drow[i];
                int ncol=co+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==false && grid[nrow][ncol]=='1')
                {
                    dfs(nrow,ncol,visited,grid);
                    
                }
            }
    }
    public void bfs(int ro,int co,boolean[][] visited,char[][] grid)
    {


         int n=grid.length;
         int m=grid[0].length;
         visited[ro][co]=true;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(ro,co));
        while(!q.isEmpty())
        {
            int row=q.peek().first;
            int col=q.peek().second;
            q.poll();


            int[] drow={-1,0,1,0};
            int[] dcol={0,1,0,-1};

            for(int i=0;i<4;i++)
            {
                   int nrow=row+drow[i];
                   int ncol=col+dcol[i];
                   if(nrow>=0 && nrow< n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && visited[nrow][ncol]==false)
                   {
                        visited[nrow][ncol]=true;
                         q.offer(new Pair(nrow,ncol));

                   }
            }

                
            

        } 

     
    }
}
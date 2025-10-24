class Pair
{
    int first;
    int second;
    int third;
    Pair(int first,int second,int third)
    {
        this.first=first;
        this.second=second;
        this.third=third;

    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                else
                {
                    visited[i][j]=0;
                }
                
            }
        }


        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int time=0;
        while(!q.isEmpty())
        {
           int row=q.peek().first;//row
           int col=q.peek().second;//clol
           int t=q.peek().third;
           time=Math.max(time,t);
           q.remove();
           for(int i=0;i<4;i++)
           {
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]!=2 && grid[nrow][ncol]==1)
            {
                q.add(new Pair(nrow,ncol,t+1));
                visited[nrow][ncol]=2;
            }



           }

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(visited[i][j]!=2 && grid[i][j]==1)
                {
                    return -1;
                }
            }
        }
        return time;
    }
}
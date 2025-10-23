//hello
class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean[][] visited=new boolean[n][m];
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<m;col++)
            {
                if(visited[row][col]==false && grid[row][col]==1)
                {
                  count=dfs(row,col,visited,grid);
                }
            }
        }
        return count;
       

    }
    public int dfs(int ro,int co,boolean[][] visited,int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        //out of bounce
         if(ro<0 || co<0 || ro>=n || co>= m )
         {
            return 1;
         }
         //if water
         if(grid[ro][co]==0)
         {
            return 1;
         }

         if(visited[ro][co]==true)
         {
            return 0;
         }



        visited[ro][co]=true;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};

        int perimeter=0;
        for(int i=0;i<4;i++)
        {
            int nrow=ro+drow[i];
            int ncol=co+dcol[i];
            perimeter+=dfs(nrow,ncol,visited,grid);
        }
        return perimeter;
        
    }
}
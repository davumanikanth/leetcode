class Solution {
    public int largestMagicSquare(int[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
        int maxSize=Math.min(n,m);
        
         for (int size = maxSize; size >= 2; size--) {
            
            for (int i = 0; i + size <= n; i++) {
                for (int j = 0; j + size <= m; j++) {
                    if (allequal(grid, i, j, size)==true) {
                        return size;
                    }
                }
            }
        }
        return 1;

    }
        
    
    public boolean allequal(int[][] mat,int r,int c,int size)
    {
        HashSet<Integer> group=new HashSet<>();

          int fx=0;
            int fy=0;
        for(int i=0;i<size;i++)
        {
            int sumx=0;
            int sumy=0;
            
            for(int j=0;j<size;j++)
            {
                sumx+=mat[r+i][c+j];
                sumy += mat[r + j][c + i];
                if(i==j)
                {
                    fx+=mat[r+i][c+j];
                }
                if(i+j==size-1)
                {
                    fy+=mat[r+i][c+j];
                }



            }
            group.add(sumx);
            group.add(sumy);
            


        }
        group.add(fx);
        group.add(fy);
        return group.size()==1;
    }
}
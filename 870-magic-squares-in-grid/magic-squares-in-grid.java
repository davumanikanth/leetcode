class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int result1=0;
        if(n==3 && m==3)
        {
            if(samesum(grid))
            {
                return 1;
            }
            else 
            {
                return 0;
            }
        }
        else
        {
        int result=0;
        for(int i=0;i<=n-3;i++)
        {
            for(int j=0;j<=m-3;j++)
            {
                int[][] mat=new int[3][3];
                for(int r=0;r<3;r++)
                {
                    for(int c=0;c<3;c++)
                    {
                        mat[r][c]=grid[r+i][c+j];
                        
                    }
                }
                if(samesum(mat)==true)
                {
                    result++;
                }
            }
        }
        return result;

        }
        
        
        
    }
    public boolean samesum(int[][] matrix)
    {
        HashSet<Integer> group=new HashSet<>();
        HashSet<Integer> group1=new HashSet<>();
        int totalsum=0;
        int d1=0;
        int d2=0;
        int target=15;
        for(int i=0;i<3;i++)
        {
           int rowsum=0;
           int colsum=0;
           
            for(int j=0;j<3;j++)
            {
                rowsum+=matrix[i][j];
                colsum+=matrix[j][i];

                totalsum+=matrix[i][j];
                if(matrix[i][j]>=1 && matrix[i][j]<=9)
                {
                group1.add(matrix[i][j]);
                }
                if(i==j)
                {
                    d1+=matrix[i][j];

                }
                if(i+j==2)
                {
                    d2+=matrix[i][j];
                }


                

 
            }
            group.add(rowsum);
            group.add(colsum);
        }
        if(group1.size()==9 && group.size()==1 && totalsum==45 && d1==d2)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
/*
00 01 02
10 11 12
20 21 22



*/ 
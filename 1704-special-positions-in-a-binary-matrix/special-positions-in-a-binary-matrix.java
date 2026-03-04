class Solution {
    public int numSpecial(int[][] mat) {
        int[] row=new int[mat.length];
                int[] col=new int[mat[0].length];

        int index=0;
        int index1=0;
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            int count1=0;
            for(int j=0;j<mat[0].length;j++)
            {
                
                if(mat[i][j]==1)
                {
                    row[i]++;
                    col[j]++;
                }


            }
           

        }
int count3=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
               if((mat[i][j]==1 && row[i]==1 &&col[j]==1))
               {
                count3++;
               } 
            }

        }
        return count3;
    }
}
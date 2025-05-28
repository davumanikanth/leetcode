class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
         int n=mat.length;
         for(int i=0;i<4;i++)
         {
            if(issame(mat,target))
            {
                return true;
            }
            mat=rotate(mat);
         }
         return false;

       
    } 
    
    public int[][] rotate(int[][] nums)
    {
        int n=nums.length;
        int[][] rotatedmatrix=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rotatedmatrix[j][n-1-i]=nums[i][j];
            }
        }
        return rotatedmatrix;

    }
    public boolean issame(int[][] a,int[][] b)
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=b[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    

}
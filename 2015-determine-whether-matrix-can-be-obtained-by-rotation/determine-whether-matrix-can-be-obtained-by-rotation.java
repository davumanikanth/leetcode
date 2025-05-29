class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
         int n=mat.length;
         //step1:- write the code for rotate of matrix in 90 degrees
         //step2:- write the code to check the rotated matrix is same as the target 
         //step3:- write the code the rotate the matrix in all the side and check with target
         //step3
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
    //step1
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
    //step2
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
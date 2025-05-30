class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int n=matrix.length;
       int m=matrix[0].length;
       int row=0;
       int coloum=m-1;
       while(row<n && coloum>=0)
       {
        if(matrix[row][coloum]==target)
        {
            return true;

        }
        else if(target<matrix[row][coloum])
        {
            coloum--;
        }
        else
        {
            row++;
        }
       }
return false;

    }
 }
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n=matrix.length;
//         int m=matrix[0].length;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 if(matrix[i][j]==target)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
        
//     }
// }
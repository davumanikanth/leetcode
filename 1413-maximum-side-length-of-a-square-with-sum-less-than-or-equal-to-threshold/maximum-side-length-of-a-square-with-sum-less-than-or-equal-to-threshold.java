class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
     //find the prefix sum first
     int n=mat.length;
     int m=mat[0].length;
     int[][] p=new int[n+1][m+1];
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=m;j++)
        {
            p[i][j]=mat[i-1][j-1]+
                    p[i-1][j]+
                    p[i][j-1]-
                    p[i-1][j-1];
        }
     }
     //we need to iterate form the 1 to minlength of matrix 
         int maxlen=Math.min(n,m);
         for(int len=1;len<=maxlen;len++)
         {
            boolean found=false;

            for(int i=len;i<=n;i++)
            {
                for(int j=len;j<=m;j++)
                {
                    int sum=p[i][j]-
                            p[i-len][j]-
                            p[i][j-len]+
                            p[i-len][j-len];


                            if(sum<=threshold)
                            {
                                found=true;
                                break;
                            }
                }
                if(found==true)
                {
                    break;
                }
            }
            if(found==false)
            {
                return len-1;
            }
         }
         return maxlen;
    }
}
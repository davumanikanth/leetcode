class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        int[][] image1=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=m-1;j>=0;j--)
            {
                image1[i][k++]=image[i][j];

            }
        }
        for(int i=0;i<image1.length;i++)
        {
            for(int j=0;j<image1[0].length;j++)
            {
                if(image1[i][j]==0) image1[i][j]=1;
                else if(image1[i][j]==1) image1[i][j]=0;
            }
        }
        return image1;

        
             
    }
}
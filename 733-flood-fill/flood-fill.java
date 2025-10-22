class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color)   
    {
        int[][] result=image.clone();
        int that_number=image[sr][sc];
        boolean[][] visited=new boolean[result.length][result[0].length];
        dfs(sr,sc,color,visited,image,result,that_number);
        return result;
        
    }
    public void dfs(int sr,int sc,int color,boolean[][] visited,int[][] image,int[][] result,int that_number)
    {
        int n=image.length;
        int m=image[0].length;
        visited[sr][sc]=true;
        result[sr][sc]=color;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
            int nrow=sr+drow[i];
            int ncol=sc+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==false && image[nrow][ncol]==that_number)
            {
                dfs(nrow,ncol,color,visited,image,result,that_number);
            }
        }
    }
}
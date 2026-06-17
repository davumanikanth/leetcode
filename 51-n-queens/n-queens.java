class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char [][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        f(0,board,ans);
        return ans;
        
    }
    public void f(int col,char[][] board,List<List<String>> ans )
    {
        if(col==board.length)
        {
            saveBoard(board,ans);
            return;

        
        }
        for(int row=0;row<board.length;row++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]='Q';
                f(col+1,board,ans);
                board[row][col]='.';
            }

        }
    }
    public boolean isSafe(char[][] board,int row,int col)
    {
        int duprow=row;
        int dupcol=col;
        //move to top left;
        while(row>=0 && col>=0 )
        {
            if(board[row][col]=='Q')return false;
            row--;
            col--;
        }
        col=dupcol;
        row=duprow;
        //move to left only
        while(col>=0)
        {
            if(board[row][col]=='Q') return false;
            col--;
        
        }
        //move to bottom left;
        col=dupcol;
        row=duprow;
        while(row<board.length && col>=0)
        {
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
    public void saveBoard(char[][] board, List<List<String>> ans){
        String row = "";
        List<String> group = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            row = "";
            for(int j = 0;j< board[0].length;j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
            group.add(row);
        }
         ans.add(group);
    }
}
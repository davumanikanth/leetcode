class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            HashSet<Character> row=new HashSet<>();
             HashSet<Character> col=new HashSet<>();
             
            for(int j=0;j<board[0].length;j++)
            {
                // for row condition 
                if(board[i][j]!='.')
                
                {
                    if(row.contains(board[i][j]))
                    {
                        return false;
                    }
                    else
                    {
                        row.add(board[i][j]);
                    }
                }
                // for coloum condition
                if(board[j][i]!='.')
                {
                    if(col.contains(board[j][i]))
                    {
                        return false;
                    }
                    else
                    {
                        col.add(board[j][i]);
                    }
                }

            }
        }
        // to check in a box 
        for(int rowlen=0;rowlen<9;rowlen+=3)
        {
             

            for(int  collen=0;collen<9;collen+=3){
                HashSet<Character> box=new HashSet<>();
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        char current=board[rowlen+i][collen+j];
                        if(current!='.')
                        {
                            if(box.contains(current))
                            {
                                return false;
                            }
                            else
                            {
                                box.add(current);
                            }
                        }
                    }
                }



            }
        }
       return true; 
        
        
    }
}
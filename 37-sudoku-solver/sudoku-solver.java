class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {

                    for (char c = '1'; c <= '9'; c++) {

                        if (isValid(board, i, j, c)) {

                            board[i][j] = c;

                            if (solve(board)) {
                                return true;
                            }

                            board[i][j] = '.'; // Backtrack
                        }
                    }

                    return false; // No valid digit found
                }
            }
        }

        return true; // Board completely filled
    }

    public boolean isValid(char[][] board, int row, int col, char ch) {

        for (int i = 0; i < 9; i++) {

            if (board[row][i] == ch)
                return false;

            if (board[i][col] == ch)
                return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {

                if (board[i][j] == ch)
                    return false;
            }
        }

        return true;
    }
}
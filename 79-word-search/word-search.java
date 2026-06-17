class Solution {

    public boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == word.charAt(0)) {

                    if (dfs(i, j, 0, board, word))
                        return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(int row, int col, int index,
                       char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        if (row < 0 || row >= n ||
            col < 0 || col >= m ||
            board[row][col] != word.charAt(index))
            return false;

        if (index == word.length() - 1)
            return true;

        char temp = board[row][col];
        board[row][col] = '#';

        int[] di = {0, 0, 1, -1};
        int[] dj = {1, -1, 0, 0};

        for (int k = 0; k < 4; k++) {

            int nrow = row + di[k];
            int ncol = col + dj[k];

            if (dfs(nrow, ncol, index + 1, board, word)) {
                board[row][col] = temp;
                return true;
            }
        }

        board[row][col] = temp;
        return false;
    }
}
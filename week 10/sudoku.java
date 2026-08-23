public class sudoku {
    public static boolean helper(char[][] board, int row, int col) {
        int nrow = row;
        int ncol = col;

        if (row == board.length) {
            return true;
        }
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            ncol = col + 1;
        }

        if (board[row][col] == '.') {
            for (int i = 1; i <= board.length; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol) == false) {
                        board[row][col] = '.';
                    } else
                        return true;
                }
            }
            return false;
        }

        return helper(board, nrow, ncol);
    }

    public static boolean isSafe(char[][] board, int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        int src_row = (row / 3) * 3;
        int src_col = (col / 3) * 3;
        for (int i = src_row; i < src_row + 3; i++) {
            for (int j = src_col; j < src_col + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        boolean solved = helper(board, 0, 0);
        System.out.println("Solved: " + solved);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

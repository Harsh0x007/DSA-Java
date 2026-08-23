public class NQueens {
    public static void placeQueens(char[][] board, int row){
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for(int col = 0; col<board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                placeQueens(board, row+1);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        //up down vertical this is unnecessary because i am doing recusrion with row,so there would be no queen placed on the placequeens(board,row)

        // Horizontal check is unnecessary because each recursive call places
        // only one queen in the current row.

        // for(int i=0; i<board.length; i++) {
        //     if(board[row][i] == 'Q') {
        //         return false;
        //     }
        // }

        //upward check
        for(int i = row-1; i >= 0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        

        //upper left
        int r = row-1;
        for(int i= col-1; i>=0 && r>=0; i--,r--) {
            if(board[r][i] == 'Q') {
                return false;
            }
        }

        //upper right
        r= row-1;
        for(int c = col+1; r>=0 && c<board.length; r--,c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

        placeQueens(board, 0);
    }
}
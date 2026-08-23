public class pathsMaze {
    public static int printPath(int row, int col,int i, int j) {
        if ( i == row || j == col) {
            return 0;
        }
        if(i == row-1 && j == col-1) {
            return 1;
        }

        int downPaths = printPath(row, col, i+1, j);

        int rightPaths = printPath(row, col, i, j+1);

        int diagonalPath = printPath(row, col, i+1, j+1);
        return downPaths + rightPaths + diagonalPath;
    }

    public static void main(String args[]) {
        int n = 3,m = 3;

        System.out.print(printPath(n, m, 0, 0));
    }
}

import java.util.Arrays;

public class markmatriZero {

    public static int[][] setZeroesBrute(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean[][] mark = new boolean[rows][cols]; 

        for(int i = 0; i< rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    //make the row true in mark2d array
                    for(int c = 0; c < cols; c++) {
                        mark[i][c] = true;
                    }

                    //make the cols true in mark2d array
                    for(int r = 0; r < rows; r++) {
                        mark[r][j] = true;
                    }
                }
            }
        }

        for(int i = 0; i< rows; i++) {
            for(int j = 0; j<cols; j++) {
                if(mark[i][j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static int[][] betterApp(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row[] = new  int[rows];
        int col[] = new int [cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        // setZeroesBrute(matrix);
        // System.out.println(Arrays.deepToString(matrix));

        betterApp(matrix);
        System.out.println(Arrays.deepToString(matrix));
        
    }
}

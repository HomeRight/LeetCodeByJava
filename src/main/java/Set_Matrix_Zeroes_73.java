import java.util.Arrays;

public class Set_Matrix_Zeroes_73 {

    public static void main(String[] args) {

        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        int rows = matrix.length;
        int colums = matrix[0].length;

        boolean firstRow = false;
        boolean firstColumn = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        firstRow = true;
                    }

                    if (j == 0) {
                        firstColumn = true;
                    }

                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }


        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < colums; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRow) {
            for (int j = 0; j < colums; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColumn) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}

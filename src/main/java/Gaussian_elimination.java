import java.util.Arrays;

public class Gaussian_elimination {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{2, 3}, {3, 2}};
        int[] ans = new int[]{5, 5};

        int[] result = new int[matrix.length];

        int top = 0, bottom = matrix.length;
        int left = 0, right = matrix.length;
        while (top < bottom || left < right) {
            int tempNum = matrix[top][left];
            int[] temp = matrix[top];

            for (int i = top + 1; i < matrix.length; i++) {

                int tempNum2 = matrix[i][left];

                for (int j = 0; j < matrix.length; j++) {
                    System.out.println("j:" + j);
                    System.out.println(matrix[i][j] * tempNum);
                    System.out.println(temp[j]);
                    System.out.println(matrix[i][left]);

                    matrix[i][j] = matrix[i][j] * tempNum - (temp[j] * tempNum2);
                }

                ans[i] = ans[i] * tempNum - (ans[top] * tempNum2);
            }

            top++;
            left++;
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.toString(ans));


    }

}

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_54 {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list = new ArrayList<>();


        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (true) {
            // 往右走
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            if (bottom < top || right < left) {
                break;
            }

            // 往下走
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (bottom < top || right < left) {
                break;
            }


            // 往左走
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if (bottom < top || right < left) {
                break;
            }

            // 往上走
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            if (bottom < top || right < left) {
                break;
            }


        }

        System.out.println(list);


    }
}

/**
 * @Description:
 * @Author: mirror6
 * @Date: 2020/9/15 17:48
 */
public class Code48 {

    public void rotate(int[][] matrix) {
        int length = matrix.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                int val = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = val;
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                int val = matrix[i][length - j - 1];
                matrix[i][length - j - 1] = matrix[i][j];
                matrix[i][j] = val;
            }
        }
    }
}

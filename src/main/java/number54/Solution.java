package number54;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/5 11:01
 */
public class Solution {


    public int[] spiralOrder(int[][] matrix) {

        //判断数组是否为空
        if (matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }
        int row = matrix[0].length;
        int col = matrix.length;

        int top = 0;
        int left = 0;
        int right = row - 1;
        int bottom = col - 1;

        int[] result = new int[row * col];
        int count = 0;
        //循环条件？
        while (left <= right && top <= bottom) {
            for (int column = left; column < right; column++) {
                result[count++] = matrix[top][column];
            }
            for (int rows = top; rows < bottom; rows++) {
                result[count++] = matrix[rows][right];
            }
            if (left < right && top < bottom) {

                for (int column = right - 1; column > left; column--) {
                    result[count++] = matrix[bottom][column];
                }
                for (int rows = bottom; rows > top; rows--) {
                    result[count++] = matrix[rows][left];
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }
        return result;
    }

}

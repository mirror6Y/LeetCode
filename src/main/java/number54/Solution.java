package number54;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/5 11:01
 */
public class Solution {


    public int[] spiralOrder(int[][] matrix) {

        //判断数组是否为空
        if (null == matrix || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rowNum = matrix[0].length;
        int colNum = matrix.length;

        int top = 0;
        int left = 0;
        int right = rowNum - 1;
        int bottom = colNum - 1;

        int[] result = new int[rowNum * colNum];
        int count = 0;
        //循环条件？
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                result[count++] = matrix[top][column];
            }
            for (int row = top + 1; row <= bottom; row++) {
                result[count++] = matrix[row][right];
            }
            if (left < right && top < bottom) {

                for (int column = right - 1; column > left; column--) {
                    result[count++] = matrix[bottom][column];
                }
                for (int row = bottom; row > top; row--) {
                    result[count++] = matrix[row][left];
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution.spiralOrder(a);
    }

}

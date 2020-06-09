package interview;

/**
 * @author mirror6
 * @description 面试题04、二维数组中的查找
 * @createTime 2020/6/9 10:25
 */
public class TwoDimensionalArraySearch {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        boolean result = false;
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int r = 0;
        int c = col - 1;

        while (r < row && c >= 0) {
            if (matrix[r][c] == target) {
                result = true;
                break;
            } else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TwoDimensionalArraySearch search = new TwoDimensionalArraySearch();
        int[][] a = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        search.findNumberIn2DArray2(a, 5);
    }
}

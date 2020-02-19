/**
 * Test
 *
 * @author mirror6
 * @date 2020/2/16
 * @description
 */
public class Test {

    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        if (1 <= m && n <= 100) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (-100 <= grid[i][j] && grid[i][j] < 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[][] grid = {{4, 3, 2, -110}, {3, 2, 1, -110}, {1, 1, -1, -200}, {-1, -1, -2, -3}};
        int[][] grid1 = {{3, 2}, {1, 0}};
        int[][] grid2 = {{3, -2}, {-1, -1}};
        int[][] grid3 = {{-1}};
        System.out.println(test.countNegatives(grid));
        System.out.println(test.countNegatives(grid1));
        System.out.println(test.countNegatives(grid2));
        System.out.println(test.countNegatives(grid3));
    }
}

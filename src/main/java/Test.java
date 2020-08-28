import java.util.*;

/**
 * Test
 *
 * @author mirror6
 * @date 2020/2/16
 * @description
 */
public class Test {


    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


    public int findShortestSubArray(int[] nums) {
        //左边界
        Map<Integer, Integer> l = new HashMap<>();
        //右边界
        Map<Integer, Integer> r = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (!l.containsKey(val)) {
                l.put(val, i);
            }
            r.put(val, i);
            int value = count.getOrDefault(val, 0);
            count.put(val, value + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, r.get(x) - l.get(x) + 1);
            }
        }
        return ans;

    }

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


    public int searchInsert(int[] nums, int target) {
        if (0 == target) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
                result = low;
            } else {
                high = mid - 1;
                result = mid;
            }
        }
        return result;
    }

    private int binarySearch(int[] a, int target) {
        int low = 0;
        int high = a.length;

        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (target > a[mid]) {
                low = mid + 1;
            } else if (target < a[mid]) {
                high = mid;
            } else {
                return mid;
            }
        }

        return -1;
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
        int[] a = {1, 2, 3, 4, 5};
        test.searchInsert(a, 2);
        test.binarySearch(a, 0);
        System.out.println(7 % 4);
        System.out.println(4 % 7);
        int[] b = {3, 2, 1, 1, 2};
        test.findShortestSubArray(b);
        test.plusOne(new int[]{1, 7, 9});
    }
}

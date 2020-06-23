package twopoint.number532;

import java.util.Arrays;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/10 9:58
 */
public class Solution {

    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int p = 0;
        int q = nums.length - 1;

        int result = 0;
        while (p <= q) {
            if (nums[q] - nums[p] == k) {
                result++;
            } else if (nums[q] - nums[p] > k) {
                q--;
            } else {
                p++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3, 1, 4, 1, 5};
        solution.findPairs(a, 2);
        System.out.println(1);
    }
}

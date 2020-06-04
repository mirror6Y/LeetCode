package twopoint.number167;

import java.util.Arrays;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/4 13:44
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int p = 0;
        int q = numbers.length - 1;

        while (p < q) {
            if (numbers[p] + numbers[q] == target) {
                numbers[0] = p + 1;
                numbers[1] = q + 1;
                break;
            } else if (numbers[p] + numbers[q] < target) {
                p++;
            } else {
                q--;
            }
        }
        return Arrays.copyOf(numbers, 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{2, 7, 11, 15};
        solution.twoSum(a, 9);
    }
}

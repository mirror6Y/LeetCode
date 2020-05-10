package number26;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Solution
 *
 * @author mirror6
 * @date 2020/2/15
 * @description
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        if (nums.length < 1) {
            return nums.length;
        } else {
            while (j < nums.length - 1) {
                if (nums[i] == nums[j]) {
                    j++;
                } else {
                    nums[i + 1] = nums[j];
                    i++;
                }
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {1, 1, 2};
        System.out.println(solution.removeDuplicates(nums));
    }
}

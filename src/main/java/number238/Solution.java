package number238;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/4 9:45
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        left[0] = 1;
        right[length - 1] = 1;

        for (int i = 1; i < length; i++) {

            left[i] = nums[i - 1] * left[i - 1];
        }

        for (int i = length - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = left[i] * right[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4};
        Solution solution = new Solution();
        solution.productExceptSelf(num);
    }
}

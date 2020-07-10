package twopoint;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的子数组，
 * 并返回其长度。如果不存在符合条件的子数组，返回 0。
 * @example 示例:
 * 栗子1：
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * 进阶：
 * 如果你已经完成了 O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 * @createTime 2020/7/10 14:35
 */
public class Code209 {

    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int p = 0;
        int q = 0;
        int sum = 0;
        // 最小窗口
        int minSize = Integer.MAX_VALUE;

        while (q < nums.length) {
            // 窗口中的元素小于目标值，右指针向右移，扩大窗口
            sum += nums[q];
            q++;

            // 窗口中的元素大于目标值，左指针向右移，缩小窗口
            while (sum >= s) {
                minSize = Math.min(minSize, q - p);
                sum -= nums[p];
                p++;
            }

        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }

    public static void main(String[] args) {
        Code209 code209 = new Code209();
        int[] a = {2, 3, 1, 2, 4, 3};
        System.out.println(code209.minSubArrayLen(7, a));
    }
}

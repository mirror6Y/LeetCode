package twopoint;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * @example 示例:
 * 栗子1：
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 * @createTime 2020/7/9 17:11
 */
public class Code487 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p = 0;
        int q = 0;

        int count = 0;
        while (p < nums.length) {
            if (nums[p] == 0) {
                count = Math.max(count, q);
                q = 0;
            } else {
                q++;
            }
            p++;
        }

        if (p == nums.length) {
            count = Math.max(count, q);
        }
        return count;
    }

    public static void main(String[] args) {
        Code487 code487 = new Code487();
        int[] a = {1, 1, 0, 1, 1, 1};
        System.out.println(code487.findMaxConsecutiveOnes(a));
    }
}

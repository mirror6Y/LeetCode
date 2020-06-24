package binarysearch;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 说明：不要使用任何内置的库函数，如  sqrt。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入：16
 * 输出：True
 * 栗子2：
 * 输入：14
 * 输出：False
 * @createTime 2020/6/24 14:59
 */
public class Code367 {

    public boolean isPerfectSquare(int num) {
        long low = 0;
        long high = num;
        while (low <= high) {
            long mid = low + ((high - low) >> 1);
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

}

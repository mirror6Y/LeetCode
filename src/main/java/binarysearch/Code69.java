package binarysearch;

/**
 * @author mirror6
 * @description 题目描述：
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: 4
 * 输出: 2
 * 栗子2：
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 * @createTime 2020/6/23 11:27
 */
public class Code69 {

    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

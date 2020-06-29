package binarysearch;

/**
 * @author mirror6
 * @description 题目描述：
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * n = 5
 * <p>
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * <p>
 * 因为第三行不完整，所以返回2.
 * 栗子2：
 * n = 8
 * <p>
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * <p>
 * 因为第四行不完整，所以返回3.
 * @createTime 2020/6/29 16:15
 * @notice 范围溢出的问题
 */
public class Code441 {

    public int arrangeCoins(int n) {
        long low = 1;
        long high = n;
        while (low <= high) {
            long mid = low + ((high - low) >> 1);
            long sum = mid * (mid + 1) / 2;
            if (sum > n) {
                high = mid - 1;
            } else if (sum < n) {
                low = mid + 1;
            } else {
                return (int) mid;
            }
        }
        return (int) low - 1;
    }

    public static void main(String[] args) {
        Code441 code441 = new Code441();
        System.out.println(code441.arrangeCoins(1804289383));
    }
}

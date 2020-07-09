package twopoint;

/**
 * @author mirror6
 * @description 题目描述：
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 栗子2：
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 * @createTime 2020/7/9 14:31
 */
public class Code344 {
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return;
        }
        int p = 0;
        int q = s.length - 1;
        char swap;
        while (p < q) {
            swap = s[p];
            s[p] = s[q];
            s[q] = swap;
            p++;
            q--;
        }
    }
}

/**
 * @author mirror6
 * @description 题目描述：
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 栗子2：
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 * @createTime 2020/7/7 13:23
 */
public class Code14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        //col
        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j);
            //row
            for (int i = 1; i < strs.length; i++) {
                if (j == strs[i].length() || c != strs[i].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] s = {"abc", "ab","ab"};
        Code14 code14 = new Code14();
        code14.longestCommonPrefix(s);
    }
}

package twopoint;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * @createTime 2020/7/15 16:45
 */
public class Code557 {

    public String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String value : a) {
            StringBuilder builder = new StringBuilder(value);
            builder.reverse();
            result.append(builder).append(" ");
        }
        return result.toString().trim();
    }
}

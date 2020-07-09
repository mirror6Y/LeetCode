/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 栗子2：
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 栗子3：
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * 说明：
 * 无空格字符构成一个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * @createTime 2020/7/8 9:47
 */
public class Code151 {

    public String reverseWords(String s) {
        String[] array = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0 && !array[i].isEmpty()) {
                result.append(array[i].trim());
            } else if (!array[i].isEmpty()) {
                result.append(array[i].trim()).append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Code151 code151 = new Code151();
        code151.reverseWords("a good   example");
    }
}

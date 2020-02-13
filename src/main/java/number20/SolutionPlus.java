package number20;

import java.util.List;
import java.util.Stack;

/**
 * SolutionPlus
 *
 * @author mirror6
 * @date 2020/2/13
 * @description 有限的括号，昨天发现java有写好的栈类，并在util包中
 * 12号解题的过程中忽略了一些情况，今天重整旗鼓，加油
 * <p>
 * 当字符串长度为奇数的时候，为false
 * 当字符串第一个字符为右括号时，为false
 * 当字符串为空的时候，为true
 */
public class SolutionPlus {


    public boolean isValid(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<>();
        //右括号开头，不需要遍历;字符串长度为奇数；直接返回false
        if (s.equals("")) {
            result = true;
        } else if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}' || s.length() % 2 == 1) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                //遍历
                char character = s.charAt(i);
                //左括号入栈
                if (character == '(' || character == '[' || character == '{') {
                    stack.push(character);
                } else if (character == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (character == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (character == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    break;
                }
            }
            if (stack.empty()) {
                result = true;
            }
        }
        return result;
    }

}

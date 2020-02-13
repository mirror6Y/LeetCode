package number20;

import lombok.NoArgsConstructor;

/**
 * Solution
 *
 * @author mirror6
 * @date 2020/2/12
 * @description 有限的括号
 */
@NoArgsConstructor
public class Solution {

    //定义一个顺序栈
    private String[] items;
    //栈的大小
    private int n;
    //栈中元素的个数
    private int count;

    //初始化栈
    public Solution(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    //栈中元素的个数
    public int size() {
        return count;
    }

    //判断栈是否为空
    public boolean isEmpty() {
        //如果count==0，栈空
        return count == 0;
    }

    //判断栈是否已满
    public boolean isFull() {
        // 如果n==count相等，栈满
        return count == n;
    }

    //入栈
    public boolean push(String item) {
        //考虑栈是否已满
        if (isFull()) {
            return false;
        }
        //空间充足，入栈
        items[count] = item;
        count++;
        return true;
    }

    //出栈
    public String pop() {
        //考虑栈是否已空
        if (isEmpty()) {
            return null;
        }
        //栈内有元素
        String item = items[count - 1];
        count--;
        return item;
    }

    public boolean isValid(String s) {
        Solution solution = new Solution(150);
        boolean result = false;
        String brackets;
        //空字符串有效
        if (s.equals("")) {
            result = true;
        } else {
            //遍历字符串
            for (int i = 0; i < s.length(); i++) {
                brackets = String.valueOf(s.charAt(i));
                //左括号入栈
                if (brackets.equals("(") || brackets.equals("[") || brackets.equals("{")) {
                    solution.push(brackets);
                } else {
                    //右括号  出栈比较
                    String peek = solution.pop();
                    //栈空说明没有左括号,右括号开头，返回false
                    if (peek == null) {
                        result = false;
                        break;
                    } else if (peek.equals("(") && brackets.equals(")")) {
                        result = true;
                    } else if (peek.equals("[") && brackets.equals("]")) {
                        result = true;
                    } else if (peek.equals("{") && brackets.equals("}")) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
                //判断还有没有左括号eg：({}
                if (i == s.length() - 1 && solution.size() > 0) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s0 = "\"[([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([\n";
        String s1 = "{}";
        System.out.println(s0 + new Solution().isValid(s0));
        System.out.println(s1 + new Solution().isValid(s1));
    }


}

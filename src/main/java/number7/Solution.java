package number7;

import lombok.NoArgsConstructor;

public class Solution {

    //定义一个顺序栈
    private String[] items;
    //栈的大小
    private int n;
    //栈中元素的个数
    private int count;

    //初始化栈
    public Solution() {
        this.items = new String[n];
        this.n = 10;
        this.count = 0;
    }

    //入栈
    public boolean push(String item) {
        //考虑栈是否已满
        // 如果n==count相等，栈满
        if (n == count) {
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
        //如果count==0，栈空
        if (count == 0) {
            return null;
        }
        //栈内有元素
        String item = items[count - 1];
        count--;
        return item;
    }

    public int reverse(int x) {
        String s = String.valueOf(x);
        Solution solution = new Solution();
        String result = "";
        if (s.contains("-")) {
            s = s.split("-")[1];
            for (int i = 0; i < s.length(); i++) {
                solution.push(String.valueOf(s.charAt(i)));
            }
            for (int i = 0; i < s.length(); i++) {
                String item = solution.pop();
                result = result.concat(item);
            }
            result = "-" + result;
            Long l=Long.valueOf(result);
            if(l>2147483647||l<-2147483648){
                return 0;
            }
            return l.intValue();
        } else {
            for (int i = 0; i < s.length(); i++) {
                solution.push(String.valueOf(s.charAt(i)));
            }
            for (int i = 0; i < s.length(); i++) {
                String item = solution.pop();
                result = result.concat(item);
            }
            Long l=Long.valueOf(result);
            if(l>2147483647||l<-2147483648){
                return 0;
            }
            return l.intValue();
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result:" + solution.reverse(1534236469));
    }
}

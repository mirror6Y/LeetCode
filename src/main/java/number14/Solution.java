package number14;

/**
 * Solution
 *
 * @author mirror6
 * @date 2020/2/15
 * @description
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        char first;
        //数组长度
        int length = strs.length;
        if (length > 0) {
            //获取最短字符串的长度，防止下标越界
            int minLength = strs[0].length();
            for (int i = 0; i < length; i++) {
                if (minLength > strs[i].length()) {
                    minLength = strs[i].length();
                }
            }
            try {
                //外层循环 负责字符
                //长度 最短字符串的长度，超过了直接break
                for (int j = 0; j < minLength; j++) {
                    //count表示字符出现的次数
                    int count = 0;
                    for (int i = 0; i < length; i++) {
                        //内层循环  负责数组
                        //first代表第一个数组的第一个字符
                        first = strs[0].charAt(j);
                        char character = strs[i].charAt(j);
                        if (first != character) {
                            throw new Exception();
                        } else {
                            count++;
                            if (count == length) {
                                result.append(character);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                return result.toString();
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] array = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(array));
    }

}

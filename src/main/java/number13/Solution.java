package number13;

/**
 * Solution
 *
 * @author mirror6
 * @date 2020/2/14
 * @description 罗马数字转数字
 * 首先判断字符串是否包含特殊情况，如果不包含可以遍历并转化成数字，
 * 如果包含，需要赋值value并删掉这种特殊情况。
 * 因为字符串中可能出现类似于：
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * 这样的特殊情况，所以最多循环三次。
 * 不过需要注意的是IX和IV这样的情况，第一次遍历之后不再包含特殊情况直接跳出循环即可。
 * <p>
 * 没有考虑组合串出现的情况！
 */
public class Solution {

    public int romanToInt(String s) {
        int value = 0;
        int index;
        //有六种特殊情况，先记录value再把它们去掉
        if (s.contains("IV") || s.contains("IX") || s.contains("XL") || s.contains("XC") || s.contains("CD") || s.contains("CM")) {
            for (int i = 0; i < 3; i++) {
                if (s.contains("IV")) {
                    value += 4;
                    index = s.indexOf("IV");
                } else if (s.contains("IX")) {
                    value += 9;
                    index = s.indexOf("IX");
                } else if (s.contains("XL")) {
                    value += 40;
                    index = s.indexOf("XL");
                } else if (s.contains("XC")) {
                    value += 90;
                    index = s.indexOf("XC");
                } else if (s.contains("CD")) {
                    value += 400;
                    index = s.indexOf("CD");
                } else if (s.contains("CM")) {
                    value += 900;
                    index = s.indexOf("CM");
                } else {
                    break;
                }
                String s1 = s.substring(0, index);
                String s2 = s.substring(index + 2);
                s = s1 + s2;
            }
        }
        //正常的串
        int length = s.length();
        for (int i = 0; i < length; i++) {
            switch (String.valueOf(s.charAt(i))) {
                case "M":
                    value += 1000;
                    break;
                case "D":
                    value += 500;
                    break;
                case "C":
                    value += 100;
                    break;
                case "L":
                    value += 50;
                    break;
                case "X":
                    value += 10;
                    break;
                case "V":
                    value += 5;
                    break;
                case "I":
                    value += 1;
                    break;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("IX"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("III"));
    }

}

package twopoint.number125;


import org.apache.commons.lang3.StringUtils;

/**
 * @author mirror6
 * @description simple  Valid Palindrome
 * <p>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * </p>
 * @createTime 2020/5/25 10:33  determine
 */
public class Solution {

    public boolean isPalindrome(String s) {

        boolean result = false;

        int length = s.replaceAll("[^a-z^A-Z^0-9]", "").length();

        if (length == 0) {
            result = true;
        } else {
            int p = 0;
            int q = length - 1;

            s = s.replaceAll("[^a-z^A-Z^0-9]", "").toLowerCase();

            for (int i = 0; i < length / 2; i++) {
                if (s.indexOf(p) == s.indexOf(q)) {
                    p++;
                    q--;
                }
            }

            if (s.indexOf(p) == s.indexOf(q)) {
                result = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(" "));
    }

}

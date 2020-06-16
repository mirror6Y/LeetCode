package twopoint.number925;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/10 10:43
 */
public class Solution {

    public boolean isLongPressedName(String name, String typed) {

        int i = 0;
        int j = 0;

        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else {
                //alex,aaleelx
                if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                    j++;
                } else {
                    return false;
                }
            }
        }

        //alex,alexa
        while (j < typed.length()) {
            if (name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "alex";
        String b = "alexr";
        System.out.println(solution.isLongPressedName(a, b));
    }
}

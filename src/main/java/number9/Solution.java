package number9;

/**
 * 思路：int转为字符数组
 * <p>
 * 根据下标去比较
 */
public class Solution {

    private String[] array = new String[10];

    public boolean isPalindrome(int x) {
        //如果参数为负数或者可以被10整除则不是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        //int转string
        String s = String.valueOf(x);
        //string转为字符串数组
        int length = s.length();
        for (int i = 0; i < length; i++) {
            array[i] = String.valueOf(s.charAt(i));
        }
        //对比
        boolean result = false;
        for (int i = 0; i < (length / 2 + 1); i++) {
            if (array[i].equals(array[length - i - 1])) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("123" + solution.isPalindrome(123));
        System.out.println("121" + solution.isPalindrome(121));
//        System.out.println("12" + solution.isPalindrome(12));
//        System.out.println("10" + solution.isPalindrome(10));
    }
}

package twopoint.number345;

/**
 * @author mirror6
 * @description
 * @createTime 2020/5/28 13:30
 */
public class Solution {

    public String reverseVowels(String s) {

        int p = 0;
        int q = s.length() - 1;
        char swap;
        char[] array = s.toCharArray();
        String vowel = "aeiouAEIOU";

        while (p < q) {
            if ((vowel.indexOf(array[p]) != -1) && ((vowel.indexOf(array[q]) != -1))) {
                swap = array[q];
                array[q] = array[p];
                array[p] = swap;
                p++;
                q--;
            } else if (vowel.indexOf(array[p]) != -1) {
                q--;
            } else if (vowel.indexOf(array[q]) != -1) {
                p++;
            } else {
                p++;
                q--;
            }

        }

        return String.valueOf(array);
    }

    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String s = "Marge, let's \\\"went.\\\" I await news telegram.";
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels(s));
        long endTime1 = System.currentTimeMillis();
        System.out.println("代码运行时间：" + (endTime1 - startTime1) + "ms");
    }


}

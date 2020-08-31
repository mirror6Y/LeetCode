import org.apache.commons.lang3.ArrayUtils;

/**
 * @author mirror6
 * @description
 * @createTime 2020/8/31 9:46
 */
public class Code5499 {


    public boolean containsPattern(int[] arr, int m, int k) {

        boolean b = false;
        int length = arr.length;
        StringBuilder builder = new StringBuilder();
        for (int value : arr) {
            builder.append(value);
        }
        String s = builder.toString();

        for (int j = 0; j + m < length; j++) {
            int count = 1;
            String sub = s.substring(j, j + m);
            for (int i = m + j; i + m <= length; i += m) {
                String temp = s.substring(i, i + m);
                if (sub.equals(temp) && temp.equals(s.substring(i - m, i))) {
                    count++;
                    if (count >= k) {
                        b = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        return b;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 4, 4, 4, 4};
        int[] a2 = new int[]{1, 2, 1, 2, 1, 1, 1, 3};
        int[] a3 = new int[]{1, 2, 1, 2, 1, 3};
        int[] a4 = new int[]{1, 2, 3, 1, 2};
        int[] a5 = new int[]{2, 2, 2, 2};
        int[] a6 = new int[]{2, 2};
        int[] a7 = new int[]{6, 3, 5, 5, 5, 5, 1, 5, 6, 2, 5, 1, 2, 5, 3, 5, 1, 3, 5, 5, 6, 4, 1, 2};
        int[] a8 = new int[]{5, 4, 5, 3, 5, 4, 5, 2, 5, 3, 2, 2, 5, 3, 2, 4, 3, 2, 5, 3, 1, 5, 5, 5, 1, 5, 1, 1, 3, 2, 1, 2, 5, 3, 3, 4, 2, 2};
        int[] a9 = new int[]{2, 3, 4, 4, 6, 2, 6, 6, 5, 3, 5, 1, 4, 3, 3, 5, 2, 5, 1, 2, 3, 3, 5, 4, 6, 1, 2, 6, 4, 2, 4, 4, 3, 2, 6, 4, 4, 2, 6, 1, 5, 6, 2, 1, 6, 6, 5, 2, 5, 1, 4, 3, 6, 5, 6, 6, 4, 4, 5, 1, 4, 2, 2, 4, 5, 3, 5, 3, 5, 3, 5, 3, 6, 2, 3, 5, 1, 6, 1, 6, 2, 3, 5, 3, 3, 2, 2, 6, 1, 6, 3, 3, 2, 5, 1};
        Code5499 code5499 = new Code5499();
        System.out.println(code5499.containsPattern(a1, 1, 3));
        System.out.println(code5499.containsPattern(a2, 2, 2));
        System.out.println(code5499.containsPattern(a3, 2, 3));
        System.out.println(code5499.containsPattern(a4, 2, 2));
        System.out.println(code5499.containsPattern(a5, 2, 3));
        System.out.println(code5499.containsPattern(a6, 1, 2));
        System.out.println(code5499.containsPattern(a7, 1, 5));
        System.out.println(code5499.containsPattern(a8, 4, 2));
        System.out.println(code5499.containsPattern(a9, 4, 2));
    }
}

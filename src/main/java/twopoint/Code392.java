package twopoint;

/**
 * @author 17666
 */
public class Code392 {

    public boolean isSubsequence(String s, String t) {
        int p = 0;
        int q = 0;
        boolean result = false;
        while (p <= s.length() - 1 && q <= t.length() - 1) {
            if (s.charAt(p) == t.charAt(q)) {
                p++;
                q++;
            } else {
                q++;
            }
        }
        if (p == s.length()) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Code392 code392 = new Code392();
        String s = "axc";
        String t = "ahbgdc";
        code392.isSubsequence(s, t);
    }

}

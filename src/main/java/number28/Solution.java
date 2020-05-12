package number28;


/**
 * @author mirror6
 * @description
 * @createTime 2020/5/12 11:20
 */
public class Solution {

    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }
        char[] content = haystack.toCharArray();
        char[] compare = needle.toCharArray();
        //被比较数组下标
        int index = 0;
        for (int i = 0; i < content.length; i++) {

            if (content[i] == compare[index]) {
                if (index == compare.length - 1) {
                    //这里有问题
                    return Math.max(i - 1, 0);
                }
                index++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = "aaa";
        String c = "aaa";
        System.out.println(solution.strStr(s, c));
    }

}

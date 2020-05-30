package twopoint.number349;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 17666
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        List list = new LinkedList();

        for(int p = 0;p<nums1.length;p++){
            for(int q = 0;q<nums2.length;q++){
                if (nums1[p] == nums2[q] && !list.contains(nums1[p])) {
                    list.add(nums1[p]);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = (int) list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num1 = new int[]{1, 2, 2, 1};
        int[] num2 = new int[]{2, 2};
        solution.intersection(num1, num2);
    }
}

package twopoint.number350;

import java.util.*;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/2 11:46
 */
public class Solution {

    private List<Integer> getListCount(List list, int[] nums) {
        List<Integer> listCount = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == (int) list.get(i)) {
                    count++;
                }
            }
            listCount.add(count);
        }
        return listCount;
    }


    public int[] intersect(int[] nums1, int[] nums2) {

        List list = new LinkedList();

        for (int p = 0; p < nums1.length; p++) {
            for (int q = 0; q < nums2.length; q++) {
                if (nums1[p] == nums2[q] && !list.contains(nums1[p])) {
                    list.add(nums1[p]);
                }
            }
        }

        List<Integer> listCount1 = getListCount(list, nums1);
        List<Integer> listCount2 = getListCount(list, nums2);

        for (int k = 0; k < listCount1.size(); k++) {
            int count = listCount1.get(k) < listCount2.get(k) ? listCount1.get(k) : listCount2.get(k);
            for (int l = 0; l < count - 1; l++) {
                list.add(list.get(k));
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
        int[] num1 = new int[]{1, 2, 1, 10, 56, 56, 20, 10};
        int[] num2 = new int[]{2, 2, 10, 56, 10};
        solution.intersect(num1, num2);
    }
}

package twopoint.number350;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author mirror6
 * @description 先排序，再用双指针
 * @createTime 2020/6/2 16:52
 */
public class SolutionPlus {

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new LinkedList<>();

        int p = 0;
        int q = 0;
        while (p < nums1.length && q < nums2.length) {

            if (nums1[p] == nums2[q]) {
                list.add(nums1[p]);
                p++;
                q++;
            } else if (nums1[p] < nums2[q]) {
                p++;
            } else {
                q++;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

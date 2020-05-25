package twopoint.number88;

import java.util.Arrays;

/**
 * @author mirror6
 * @description 双指针 从左向右
 */
public class Solution {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int[] numCopy = new int[m];
        System.arraycopy(nums1, 0, numCopy, 0, m);


        int i = 0;
        int j = 0;
        int index = 0;

        while (i < m && j < n) {
            if (numCopy[i] < nums2[j]) {
                nums1[index] = numCopy[i];
                i++;
            } else {
                nums1[index] = nums2[j];
                j++;
            }
            index++;

        }

        if (i < m) {
            System.arraycopy(numCopy, i, nums1, i + j, m - i);
        }

        if (j < n) {
            System.arraycopy(nums2, j, nums1, i + j, n - j);
        }

        //可能有剩余元素
        return nums1;
    }


    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] a1 = {1, 2, 3, 7, 0, 0, 0};
        int[] a2 = {2, 5, 6};
        System.out.println(Arrays.toString(solution.merge(a1, 4, a2, a2.length)));
        System.out.println(1);
    }

}

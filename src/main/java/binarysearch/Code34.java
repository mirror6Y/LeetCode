package binarysearch;

import java.util.Arrays;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 栗子2：
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 * @createTime 2020/6/22 11:08
 */
public class Code34 {

    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                int[] a = {mid, mid};
                int tmp = mid - 1;
                while (tmp >= 0 && nums[tmp] == target) {
                    a[0] = tmp;
                    tmp--;
                }
                tmp = mid + 1;
                while (tmp <= nums.length - 1 && nums[tmp] == target) {
                    a[1] = tmp;
                    tmp++;
                }
                return a;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] a = {1, 8};
        System.out.println(Arrays.toString(Code34.searchRange(a, 8)));
    }
}

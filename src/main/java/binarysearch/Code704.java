package binarysearch;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 来源：力扣（LeetCode）
 * @createTime 2020/6/23 14:08
 */
public class Code704 {

    private int searchRecursive(int[] a, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) >> 1);
        if (a[mid] == target) {
            return mid;
        } else if (a[mid] > target) {
            return searchRecursive(a, low, mid - 1, target);
        } else {
            return searchRecursive(a, mid + 1, high, target);
        }
    }

    public int search(int[] nums, int target) {
        return searchRecursive(nums, 0, nums.length - 1, target);
    }

    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        Code704 code704 = new Code704();
        code704.search(a, 2);
    }
}

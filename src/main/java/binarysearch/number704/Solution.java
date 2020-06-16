package binarysearch.number704;

/**
 * @author 17666
 */
public class Solution {

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
        Solution solution = new Solution();
        int[] a = {-1, 0, 3, 5, 9, 12};
        solution.search(a, 2);
    }
}

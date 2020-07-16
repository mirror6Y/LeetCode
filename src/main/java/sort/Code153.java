package sort;

/**
 * @author mirror6
 * @description 题目描述：
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素。
 * 你可以假设数组中不存在重复元素。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * 栗子2：
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 * @createTime 2020/7/16 9:41
 */
public class Code153 {

    public int findMin(int[] nums) {
        int i = 1;
        while (i < nums.length) {

            int j = i;
            while (j > 0) {
                int swap;
                if (nums[j] < nums[j - 1]) {
                    swap = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = swap;
                }
                j--;
            }
            i++;
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        Code153 code153 = new Code153();
        code153.findMin(a);
    }
}

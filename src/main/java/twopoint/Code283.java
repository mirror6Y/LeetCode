package twopoint;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * @createTime 2020/7/20 10:08
 */
public class Code283 {

    public void moveZeroes(int[] nums) {
        int p = 0;
        int q = 0;

        while (p < nums.length) {
            if (nums[p] != 0) {
                nums[q] = nums[p];
                q++;
            }
            p++;
        }

        for (int i = nums.length - (p - q); i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

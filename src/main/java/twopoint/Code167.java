package twopoint;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * @createTime 2020/7/9 14:45
 */
public class Code167 {
    public int[] twoSum(int[] numbers, int target) {
        int p = 0;
        int q = numbers.length - 1;
        int[] result = new int[2];
        while (p < q) {
            if (numbers[p] + numbers[q] == target) {
                result[0] = p + 1;
                result[1] = q + 1;
                break;
            } else if (numbers[p] + numbers[q] < target) {
                p++;
            } else {
                q--;
            }
        }
        return result;
    }
}

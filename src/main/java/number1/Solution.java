package number1;

import java.util.Arrays;

/**
 * @author mirror6
 * @description
 * @createTime 2020/5/29 10:40
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int length = nums.length;

        for (int i = 0; i < length ; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    nums[0] = i;
                    nums[1] = j;
                }
            }
        }

        return Arrays.copyOf(nums, 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] a=new int[]{2,7,11,15};
        int[] a = new int[]{3, 2, 4};
        solution.twoSum(a, 6);
        System.out.println("1");
    }

}

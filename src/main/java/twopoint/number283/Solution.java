package twopoint.number283;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 17666
 */
public class Solution {


    public void moveZeroes(int[] nums) {


        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < nums.length - j; j++) {
            nums[j] = 0;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{0,1,0,4,6};
        solution.moveZeroes(a);
    }
}

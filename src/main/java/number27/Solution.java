package number27;

/**
 * @author mirror6
 */
public class Solution {

    public int removeElement(int[] nums, int val) {

        int i = 0;
        int j = nums.length - 1;

        //注意：这里的j不是数组长度
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return j + 1;
    }
}

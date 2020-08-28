package array;

/**
 * @author mirror6
 * @description
 * @createTime 2020/8/28 11:08
 */
public class Code189 {

    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }

        for (int i = 0; i < k; i++) {
            int last = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = last;
        }
    }

    public void rotate1(int[] nums, int k) {
        int length = nums.length;
        if (length == 0 || length == 1) {
            return;
        }
        for (int j = 0; j < k; j++) {
            int last = nums[length - 1];
            for (int i = length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
        }
    }


    public static void main(String[] args) {

        Code189 code189 = new Code189();
        code189.rotate1(new int[]{1, 2, 3, 4, 5}, 3);
    }
}

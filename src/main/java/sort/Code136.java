package sort;

import java.util.*;

/**
 * @author mirror6
 * @description
 * @createTime 2020/8/31 11:43
 */
public class Code136 {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int i = 0;
        while (i + 1 < nums.length) {
            if (nums[i] != nums[i + 1]) {
                res = nums[i];
            } else {
                i++;
            }
            i++;
        }
        if (nums.length - 1 == i) {
            res = nums[i];
        }
        return res;
    }

    public int singleNumber1(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            if (!set.contains(val)) {
                set.add(val);
            } else {
                set.remove(val);
            }
        }
        List<Integer> list = new LinkedList<>(set);
        return list.size() != 0 ? list.get(0) : 0;
    }

    public int singleNumber2(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}

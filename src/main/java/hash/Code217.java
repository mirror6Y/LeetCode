package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mirror6
 * @description
 * @createTime 2020/8/31 10:57
 */
public class Code217 {

    public boolean containsDuplicate(int[] nums) {
        boolean b = false;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]) + 1;
                if (count >= 2) {
                    b = true;
                    break;
                }
                map.put(nums[i], count);
            } else {
                map.put(nums[i], 1);
            }
        }
        return b;
    }

    public boolean containsDuplicate1(int[] nums) {
        boolean b = false;
        Arrays.sort(nums);
        for (int i = 0; i + 1 < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                b = true;
                break;
            }
        }
        return b;
    }

}

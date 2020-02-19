package number26;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Solution
 *
 * @author mirror6
 * @date 2020/2/15
 * @description
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {1, 1, 2};
        System.out.println(solution.removeDuplicates(nums));
    }
}

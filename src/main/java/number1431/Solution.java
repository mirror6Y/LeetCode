package number1431;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/1 10:24
 */
public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean result = false;
        List<Boolean> kidsWithCandies = new LinkedList<>();
        for (int candy : candies) {
            int after = candy + extraCandies;

            for (int i : candies) {
                if (after >= i) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            kidsWithCandies.add(result);

        }

        return kidsWithCandies;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{2, 3, 5, 1, 3};
        int b = 3;
        solution.kidsWithCandies(a, b);
    }
}

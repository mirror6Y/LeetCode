package binarysearch.number374;

/**
 * @author 17666
 */
public class Solution {

    public int guessNumber(int n) {

        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}

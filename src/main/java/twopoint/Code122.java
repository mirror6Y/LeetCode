package twopoint;

/**
 * @author mirror6
 * @description
 * @createTime 2020/8/27 16:46
 */
public class Code122 {

    public int maxProfit(int[] prices) {
        int p = 0;
        int q = 1;
        int val = 0;
        while (q < prices.length) {
            if (prices[p] < prices[q]) {
                val += prices[q] - prices[p];
            }
            p++;
            q++;
        }
        return val;
    }
}

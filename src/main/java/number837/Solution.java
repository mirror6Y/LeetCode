package number837;

/**
 * @author 17666
 */
public class Solution {

    public double new21Game(int N, int K, int W) {

        double[] result = new double[K + W];

        for (int i = K; K <= N; i++) {
            result[i] = 1;
        }
        result[K - 1] = 0;
        for (int x = K - 1; x > -1; x--) {
            for (int j = 1; j <= W; j++) {
                result[x] += result[x + j] / W;
            }
        }

        return result[0];

    }

}

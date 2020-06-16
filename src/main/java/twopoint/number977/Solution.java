package twopoint.number977;

import java.util.Arrays;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/10 10:31
 */
public class Solution {

    public int[] sortedSquares(int[] A) {

        int[] a = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            a[i] = A[i] * A[i];
        }

        Arrays.sort(a);
        return a;

    }
}

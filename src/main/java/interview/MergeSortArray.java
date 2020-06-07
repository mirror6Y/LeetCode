package interview;

import java.util.Arrays;

/**
 * @author 17666
 */
public class MergeSortArray {

    public void merge(int[] A, int m, int[] B, int n) {

        int[] copy = Arrays.copyOf(A, m);

        int p = 0;
        int q = 0;

        int i = 0;

        while (p < m && q < n) {
            if (copy[p] < B[q]) {
                A[i] = copy[p];
                p++;
            } else {
                A[i] = B[q];
                q++;
            }
            i++;
        }

        if (p < m) {
            System.arraycopy(copy, p, A, i, m - p);
        }
        if (q < n) {
            System.arraycopy(B, q, A, i, n - q);
        }
    }

    public static void main(String[] args) {
        MergeSortArray array = new MergeSortArray();
        int[] a = new int[]{1, 2, 3, 0, 0, 0, 0, 0};
        int[] b = new int[]{2, 5, 6, 7, 9};
        array.merge(a, 3, b, 5);
    }
}

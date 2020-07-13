package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author mirror6
 * @description 剑指offer 01.08 零矩阵
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入：
 * [
 * [1,1,1],
 * [1,0,1],
 * [1,1,1]
 * ]
 * 输出：
 * [
 * [1,0,1],
 * [0,0,0],
 * [1,0,1]
 * ]
 * 栗子2：
 * 输入：
 * [
 * [0,1,2,0],
 * [3,4,5,2],
 * [1,3,1,5]
 * ]
 * 输出：
 * [
 * [0,0,0,0],
 * [0,4,5,0],
 * [0,3,1,0]
 * ]
 * @createTime 2020/7/13 14:07
 */
public class Code0108 {

    public void setZeroes(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (0 == matrix[i][j]) {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                //row
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[list.get(i)][j] = 0;
                }
            } else {
                //col
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][list.get(i)] = 0;
                }
            }
        }
    }

    public void setZeroes1(int[][] matrix) {

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (0 == matrix[i][j]) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (Integer row : rows) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }

        for (Integer col : cols) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col] = 0;
            }
        }

    }
}

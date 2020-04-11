package number56;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int[][] merge(int[][] intervals) {

        //判断是否为空数组
        if (0 == intervals.length) {
            return intervals;
        } else {
            //二维数组转list
            List<Integer> inline;
            List<List<Integer>> outline = new ArrayList<>();
            for (int i = 0; i < intervals.length; i++) {
                inline = new ArrayList<>();
                for (int j = 0; j < intervals[i].length; j++) {
                    inline.add(intervals[i][j]);
                }
                outline.add(inline);
            }

            //根据区间的第一个元素进行排序
            List<List<Integer>> sort = outline.stream().sorted(Comparator.comparing(o -> o.get(0))).collect(Collectors.toList());
            //list的结果
            List<List<Integer>> resultList = new ArrayList<>();
            resultList.add(sort.get(0));
            //没有交集的时候count++
            int count = 0;
            for (int k = 1; k < intervals.length; k++) {
                //比较当前元素的头部与之前元素的尾部,没有交集直接放入结果
                if (resultList.get(count).get(1) >= sort.get(k).get(0)) {
                    /*
                     *比较两个区间的尾部
                     * [1,3],[2,6] and [1,1],[1,4]
                     * [1,4],[2,3]
                     */
                    if (resultList.get(count).get(1) <= sort.get(k).get(1)) {
                        resultList.get(count).set(1, sort.get(k).get(1));
                    } else {
                        resultList.get(count).set(1, resultList.get(count).get(1));
                    }
                } else {
                    resultList.add(sort.get(k));
                    count++;
                }
            }

            //list转回二维数组
            int[] in;
            int[][] result = new int[resultList.size()][];
            for (int i = 0; i < resultList.size(); i++) {
                in = new int[2];
                for (int j = 0; j < resultList.get(i).size(); j++) {
                    in[j] = resultList.get(i).get(j);
                }
                result[i] = in;
            }
            return result;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] array = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        solution.merge(array);
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 17666
 * @description 题目描述：
 * 给出一个区间的集合，请合并所有重叠的区间。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 栗子2：
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */
public class Code56 {

    public int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length <= 0) {
            return new int[][]{};
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> list = new LinkedList<>();
        list.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            //当前数组
            int[] current = intervals[i];
            //结果集中的最后一个元素
            int[] compare = list.get(list.size() - 1);

            if (compare[1] < current[0]) {
                list.add(intervals[i]);
            } else {
                compare[1] = Math.max(compare[1], current[1]);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}

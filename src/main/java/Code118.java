import java.util.ArrayList;
import java.util.List;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子1：
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * @createTime 2020/7/14 9:45
 */
public class Code118 {

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        list.add(one);
        for (int i = 1; i < numRows; i++) {
            List<Integer> child = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    child.add(1);
                } else {
                    child.add(list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));
                }
            }
            list.add(child);
        }
        return list;
    }

    public static void main(String[] args) {
        Code118 code118 = new Code118();
        code118.generate(5);
    }
}

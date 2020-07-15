import java.util.ArrayList;
import java.util.List;

/**
 * @author mirror6
 * @description
 * @createTime 2020/7/14 10:17
 */
public class Code119 {

    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        list.add(one);
        for (int i = 1; i < 34; i++) {
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
        return list.get(rowIndex);
    }
}

package hash;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: mirror6
 * @Date: 2020/9/27 2:52
 */
public class Code387 {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

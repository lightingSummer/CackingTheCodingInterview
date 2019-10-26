package code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 珠玑妙算 {
    public int[] calcResult(String A, String guess) {
        // write code here
        int[] res = new int[2];
        int len = A.length();
        int[] cnt = new int[4];
        Map<Character, Integer> index = new HashMap<>();
        index.put('R', 0);
        index.put('Y', 1);
        index.put('G', 2);
        index.put('B', 3);
        for (int i = 0; i < len; i++) {
            char a = A.charAt(i);
            char g = guess.charAt(i);
            if (cnt[index.get(a)] < 0) {
                res[1]++;
            }
            cnt[index.get(a)]++;
            if (cnt[index.get(g)] > 0) {
                res[1]++;
            }
            cnt[index.get(g)]--;
            if (a == g) {
                res[0]++;
            }
        }
        res[1] -= res[0];
        return res;
    }
}

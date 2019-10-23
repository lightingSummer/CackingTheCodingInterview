package code;

import java.util.HashSet;
import java.util.Set;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/23 0023
 * @description：
 */
public class 最近公共祖先 {
    public int getLCA(int a, int b) {
        // write code here
        Set<Integer> forefathersOfA = new HashSet<>();
        while (a > 0) {
            forefathersOfA.add(a);
            a /= 2;
        }
        while (b > 0) {
            if (forefathersOfA.contains(b)) {
                return b;
            }
            b /= 2;
        }
        return 0;
    }
}

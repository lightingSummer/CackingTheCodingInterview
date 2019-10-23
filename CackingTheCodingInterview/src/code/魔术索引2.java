package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/23 0023
 * @description：
 */
public class 魔术索引2 {
    public boolean findMagicIndex(int[] A, int n) {
        for (int i = 0; i < n; ) {
            if (A[i] == i) {
                return true;
            } else if (A[i] > i) {
                i = A[i];
            } else {
                i++;
            }
        }
        return false;
    }
}

package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/23 0023
 * @description：
 */
public class 魔术索引 {
    public boolean findMagicIndex(int[] A, int n) {
        // write code here
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) >> 2;
            if (A[mid] == mid) {
                return true;
            } else if (A[mid] < mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

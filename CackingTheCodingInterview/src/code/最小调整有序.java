package code;

import java.util.Arrays;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 最小调整有序 {
    public int[] findSegment(int[] A, int n) {
        // write code here
        int[] copy = Arrays.copyOf(A, A.length);
        Arrays.sort(copy);
        int left = 0, right = n - 1;
        while (copy[left] == A[left]) {
            left++;
            if (left == n) {
                return new int[]{0, 0};
            }
        }
        while (copy[right] == A[right]) {
            right--;
        }
        return new int[]{left, right};
    }
}

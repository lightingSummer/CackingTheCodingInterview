package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 最大连续数列和 {
    public int getMaxSum(int[] A, int n) {
        // write code here
        int sum = A[0];
        int max = sum;
        for (int i = 1; i < n; i++) {
            if (sum < 0) {
                sum = A[i];
            } else {
                sum += A[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}

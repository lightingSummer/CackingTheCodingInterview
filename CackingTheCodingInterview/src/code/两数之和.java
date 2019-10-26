package code;

import java.util.Arrays;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 两数之和 {
    public int countPairs(int[] A, int n, int sum) {
        // write code here
        int left = 0, right = n - 1, cnt = 0;
        Arrays.sort(A);
        while (left < right) {
            if (A[left] + A[right] == sum) {
                if (A[left] != A[right]) {
                    int leftCnt = 1, rightCnt = 1;
                    int val = A[left++];
                    while (left < right && val == A[left]) {
                        leftCnt++;
                        left++;
                    }
                    val = A[right--];
                    while (left < right && val == A[right]) {
                        rightCnt++;
                        right--;
                    }
                    cnt += leftCnt * rightCnt;
                } else {
                    int x = right - left + 1;
                    cnt += x * (x - 1) / 2;
                    break;
                }
            } else if (A[left] + A[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        return cnt;
    }
}

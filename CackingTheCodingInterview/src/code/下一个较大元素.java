package code;

import java.util.Stack;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 下一个较大元素 {
    public int[] findNext(int[] A, int n) {
        // write code here
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                A[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            A[stack.pop()] = -1;
        }
        return A;
    }
}

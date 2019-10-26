package code;

import java.util.Stack;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 下一个较大元素2 {
    public int[] findNext(int[] A, int n) {
        // write code here
        Stack<Integer> orderStack = new Stack<>();
        Stack<Integer> supportStack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int val = A[i];
            while (!orderStack.isEmpty() && orderStack.peek() <= val) {
                supportStack.push(orderStack.pop());
            }
            A[i] = orderStack.isEmpty() ? -1 : orderStack.peek();
            orderStack.push(val);
            while (!supportStack.isEmpty()) {
                orderStack.push(supportStack.pop());
            }
        }
        return A;
    }
}

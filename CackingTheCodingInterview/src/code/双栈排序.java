package code;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/22 0022
 * @description：
 */
public class 双栈排序 {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            stack1.push(numbers[i]);
        }
        while (!stack1.isEmpty()) {
            if (stack2.isEmpty() || stack1.peek() >= stack2.peek()) {
                stack2.push(stack1.pop());
            } else {
                int val = stack1.pop();
                while (!stack2.isEmpty() && stack2.peek() > val) {
                    stack1.push(stack2.pop());
                }
                stack2.push(val);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stack2.isEmpty()) {
            res.add(stack2.pop());
        }
        return res;
    }
}

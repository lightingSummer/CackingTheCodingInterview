package code;

import java.util.Stack;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/24 0024
 * @description：
 */
public class 合法括号匹配 {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}

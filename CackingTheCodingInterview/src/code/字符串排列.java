package code;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/23 0023
 * @description：
 */
public class 字符串排列 {
    public ArrayList<String> getPermutation(String A) {
        // write code here
        ArrayList<String> list = new ArrayList<>();
        dfs(A.toCharArray(), new boolean[A.length()], new StringBuilder(), list);
        list.sort(Comparator.reverseOrder());
        return list;
    }

    private void dfs(char[] chars, boolean[] hasVisited, StringBuilder sb, ArrayList<String> list) {
        if (sb.length() == chars.length) {
            list.add(sb.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (!hasVisited[i]) {
                hasVisited[i] = true;
                sb.append(chars[i]);
                dfs(chars, hasVisited, sb, list);
                sb.deleteCharAt(sb.length() - 1);
                hasVisited[i] = false;
            }
        }
    }
}

package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/26 0026
 * @description：
 */
public class 子串判断 {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] res = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (s.contains(p[i])) {
                res[i] = true;
            } else {
                res[i] = false;
            }
        }
        return res;
    }
}

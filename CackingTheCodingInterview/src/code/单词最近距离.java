package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 单词最近距离 {
    public int getDistance(String[] article, int n, String x, String y) {
        // write code here
        int preX = -1, preY = -1, res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (article[i].equals(x)) {
                if (preY != -1) {
                    res = Math.min(res, i - preY);
                }
                preX = i;
            } else if (article[i].equals(y)) {
                if (preX != -1) {
                    res = Math.min(res, i - preX);
                }
                preY = i;
            }
        }
        return res;
    }
}

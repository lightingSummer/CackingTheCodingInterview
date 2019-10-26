package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 词频统计 {
    public int getFrequency(String[] article, int n, String word) {
        // write code here
        int cnt = 0;
        for (String str : article) {
            if (str.equals(word)) {
                cnt++;
            }
        }
        return cnt;
    }
}

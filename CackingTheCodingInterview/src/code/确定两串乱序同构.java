package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/21 0021
 * @description：
 */
public class 确定两串乱序同构 {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if (stringA == null || stringB == null || stringA.length() != stringB.length()) {
            return false;
        }
        int[] count = new int[256];
        for (int i = 0; i < stringA.length(); i++) {
            count[stringA.charAt(i)]++;
            count[stringB.charAt(i)]--;
        }
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}

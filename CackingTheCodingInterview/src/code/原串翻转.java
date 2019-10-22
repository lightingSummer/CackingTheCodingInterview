package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/21 0021
 * @description：
 */
public class 原串翻转 {
    public String reverseString(String iniString) {
        // write code here
        if (iniString == null || iniString.length() == 0) {
            return iniString;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = iniString.length() - 1; i >= 0; i--) {
            sb.append(iniString.charAt(i));
        }
        return sb.toString();
    }
}

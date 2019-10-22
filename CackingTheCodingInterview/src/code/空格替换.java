package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/21 0021
 * @description：
 */
public class 空格替换 {
    public String replaceSpace(String iniString, int length) {
        // write code here
        if (iniString == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : iniString.toCharArray()) {
            sb.append(c == ' ' ? "%20" : c);
        }
        return sb.toString();
    }
}

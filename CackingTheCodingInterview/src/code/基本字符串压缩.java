package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/21 0021
 * @description：
 */
public class 基本字符串压缩 {
    public String zipString(String iniString) {
        // write code here
        int low = 0, high = 0;
        int len = iniString.length();
        StringBuilder sb = new StringBuilder();
        while (low < len) {
            high = low;
            char c = iniString.charAt(low);
            while ((high < len) && (iniString.charAt(high) == c)) {
                high++;
            }
            int count = high - low;
            sb.append(c);
            sb.append(count);
            low = high;
        }
        return (sb.toString().length() < len) ? sb.toString() : iniString;
    }
}

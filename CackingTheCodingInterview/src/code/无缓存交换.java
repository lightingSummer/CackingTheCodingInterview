package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 无缓存交换 {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] ^= AB[1];
        AB[1] ^= AB[0];
        AB[0] ^= AB[1];
        return AB;
    }
}

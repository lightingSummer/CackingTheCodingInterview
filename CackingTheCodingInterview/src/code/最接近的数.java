package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/27 0027
 * @description：
 */
public class 最接近的数 {
    public int[] getCloseNumber(int x) {
        // write code here
        int big = x + 1, small = x - 1;
        int count = bitCount(x);
        while (bitCount(big) != count) {
            big++;
        }
        while (bitCount(small) != count && small >= 0) {
            small--;
        }
        return new int[]{small, big};
    }

    private int bitCount(int x) {
        int count = 0;
        while (x != 0) {
            count += x & 1;
            x = x >> 1;
        }
        return count;
    }
}

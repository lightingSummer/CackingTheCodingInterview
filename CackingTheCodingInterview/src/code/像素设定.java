package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/29 0029
 * @description：
 */
public class 像素设定 {
    public int[] renderPixel(int[] screen, int x, int y) {
        // write code here
        for (int i = x; i <= y; i++) {
            int index = i / 8;
            int bit = i % 8;
            screen[index] |= 1 << bit;
        }
        return screen;
    }
}

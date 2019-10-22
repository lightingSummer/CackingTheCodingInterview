package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/22 0022
 * @description：
 */
public class 高度最小的BST {
    public int buildMinimalBST(int[] vals) {
        // write code here
        int height = 0;
        int size = vals.length;
        while (size > 0) {
            height++;
            size = size / 2;
        }
        return height;
    }
}

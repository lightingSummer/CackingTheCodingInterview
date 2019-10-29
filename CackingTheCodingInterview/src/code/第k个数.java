package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/27 0027
 * @description：
 */
public class 第k个数 {
    public int findKth(int k) {
        // write code here
        int[] array = new int[k];
        array[0] = 3;
        array[1] = 5;
        array[2] = 7;
        int index3 = 0, index5 = 0, index7 = 0;
        for (int i = 3; i < k; i++) {
            array[i] = Math.min(array[index3] * 3, Math.min(array[index5] * 5, array[index7] * 7));
            if (array[i] == array[index3] * 3) index3++;
            if (array[i] == array[index5] * 5) index5++;
            if (array[i] == array[index7] * 7) index7++;
        }
        return array[k - 1];
    }
}

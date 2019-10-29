package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/29 0029
 * @description： 奇偶数交替，找破坏规则的那个数
 */
public class 找出缺失的整数 {
    public int findMissing(int[][] numbers, int n) {
        // write code here
        for (int i = 0; i < n; i++) {
            if (numbers[i][0] != i % 2) {
                return i;
            }
        }
        return n;
    }
}

package 小白月赛18;

import java.util.Scanner;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (array[i] == 0) {
                array[i] = i;
                for (int j = 2; j * i <= n; j++) {
                    if (array[j * i] == 0) {
                        array[j * i] = i;
                    }
                }
            }
        }
        long res = 0;
        for (int val : array) {
            res += val;
        }
        System.out.println(res);
    }
}

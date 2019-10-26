package 小白月赛18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] params = bf.readLine().split(" ");
        String[] values = bf.readLine().split(" ");
        int len = Integer.valueOf(params[0]);
        int numOfGroup = Integer.valueOf(params[1]);
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = Integer.valueOf(values[i]);
        }
        Arrays.sort(array);
        int right = len - 1, res = 0;
        while (right >= numOfGroup) {
            res += array[right] - array[len - right - 1];
            right--;
        }
        System.out.println(res);
    }
}

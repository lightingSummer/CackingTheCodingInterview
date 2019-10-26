package 小白月赛18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(getMinTime(array, 0, n - 1, 0));
    }

    private static int getMinTime(int[] array, int left, int right, int add) {
        if (left > right) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (array[i] < min) {
                min = array[i];
                list = new ArrayList<>();
                list.add(i);
            } else if (array[i] == min) {
                list.add(i);
            }
        }
        int res = min - add;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                res += getMinTime(array, left, list.get(i) - 1, min);
            } else if (i == list.size() - 1) {
                res += getMinTime(array, list.get(i) + 1, right, min);
            } else {
                res += getMinTime(array, list.get(i) + 1, list.get(i) - 1, min);
            }
        }
        return res;
    }
}

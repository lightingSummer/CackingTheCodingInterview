package code;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/24 0024
 * @description：
 */
public class 洪水 {
    private final int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int floodFill(int[][] map, int n, int m) {
        // write code here
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(0, 0));
        boolean[][] hasVisited = new boolean[n][m];
        int step = 0, size = 1, time = 1;
        hasVisited[0][0] = true;
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> point = queue.poll();
            step++;
            for (int[] d : dir) {
                int row = point.getKey() + d[0];
                int col = point.getValue() + d[1];
                if (row == n - 1 && col == m - 1) {
                    return time;
                }
                if (row >= 0 && row < n && col >= 0 && col < m
                        && map[row][col] == 0
                        && !hasVisited[row][col]) {
                    queue.offer(new Pair<>(row, col));
                    hasVisited[row][col] = true;
                }
            }
            if (step == size) {
                step = 0;
                size = queue.size();
                time++;
            }
        }
        return -1;
    }
}

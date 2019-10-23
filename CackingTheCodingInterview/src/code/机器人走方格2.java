package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/23 0023
 * @description：
 */
public class 机器人走方格2 {
    private static final int mod = 1000000007;

    public int countWays(int[][] map, int x, int y) {
        // write code here
        for (int i = 1; i < x; i++) {
            map[i][0] = map[i][0] == 1 ? map[i - 1][0] : 0;
        }
        for (int i = 1; i < y; i++) {
            map[0][i] = map[0][i] == 1 ? map[0][i - 1] : 0;
        }
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                map[i][j] = map[i][j] == 1 ? (map[i - 1][j] + map[i][j - 1]) % mod : 0;
            }
        }
        return map[x - 1][y - 1];
    }
}

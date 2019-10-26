package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/24 0024
 * @description：
 */
public class 硬币表示 {
    public int countWays(int n) {
        // write code here
        final int mod = 1000000007;
        int[] coins = {1, 5, 10, 25};
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= n; i++) {
                dp[i] = (dp[i] + dp[i - coin]) % mod;
            }
        }
        return dp[n];
    }
}

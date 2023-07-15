class Solution {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];
        for (int i = x; i < y + 1; i++) {
            // 처음 i = x 이후 진행된 숫자들은 dp에 값이 존재함
            if (i != x && dp[i] == 0) {
                dp[i] = -1;
                continue;
            }
            if (i * 2 <= y) {
                dp[i * 2] = (dp[i * 2] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 2]);
            }
            if (i * 3 <= y) {
                dp[i * 3] = (dp[i * 3] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 3]);  
            }
            if (i + n <= y) {
                dp[i + n] = (dp[i + n] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i + n]);
            }
        }
        return dp[y];
    }
}
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;

        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            // 맨 왼쪽줄의 합
            dp[i][0] = dp[i - 1][0] + triangle[i][0];

            // 중간에 있는 수들의 합
                for (int j = 1; j < i; j++) {
                     dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + triangle[i][j]; // 양쪽중 큰 값과 이전값의 합
                    }
                    // 맨 오른쪽줄의 합
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];        
            }

                for (int i = 0; i < triangle.length; i++) {
                    answer = Math.max(answer, dp[triangle.length - 1][i]);
                }
        return answer;
    }
}
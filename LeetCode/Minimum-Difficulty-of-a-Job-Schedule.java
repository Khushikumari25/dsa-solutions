class Solution {

    static Integer[][] dp;

    public int minDifficulty(int[] jobDifficulty, int d) {

        int n = jobDifficulty.length;

        if (d > n) {
            return -1;
        }

        dp = new Integer[n][d + 1];

        return solve(0, d, jobDifficulty);
    }

    public int solve(int i, int d, int[] jobDifficulty) {

        int n = jobDifficulty.length;

        // Only one day remaining
        if (d == 1) {

            int max = 0;

            for (int j = i; j < n; j++) {
                max = Math.max(max, jobDifficulty[j]);
            }

            return max;
        }

        // Already calculated
        if (dp[i][d] != null) {
            return dp[i][d];
        }

        int maxDifficulty = 0;
        int answer = Integer.MAX_VALUE;

        // Decide where current day ends
        for (int j = i; j <= n - d; j++) {

            maxDifficulty =
                Math.max(maxDifficulty, jobDifficulty[j]);

            int remaining =
                solve(j + 1, d - 1, jobDifficulty);

            answer = Math.min(
                answer,
                maxDifficulty + remaining
            );
        }

        return dp[i][d] = answer;
    }
}
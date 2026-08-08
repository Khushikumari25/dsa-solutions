class Solution {

    HashMap<Integer, Integer> dp = new HashMap<>();

    public int minDays(int n) {
        return solve(n);
    }

    public int solve(int n) {

        if (n <= 1) {
            return n;
        }

        if (dp.containsKey(n)) {
            return dp.get(n);
        }

        int by2 = n % 2 + solve(n / 2);
        int by3 = n % 3 + solve(n / 3);

        int ans = 1 + Math.min(by2, by3);

        dp.put(n, ans);

        return ans;
    }
}
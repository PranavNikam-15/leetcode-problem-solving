class Solution {
    public int climbStairs(int n) {
        
        if (n == 1 || n == 0) {
            return 1;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return fibonacci(n, dp);
    }

    public int fibonacci(int n, int[] dp) {

        if(n == 0 || n == 1) {
            return 1;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);
        return dp[n];
    }
}
class Solution {
        public int solution(int n) {

            if(n <= 1) return n;

            int[] dp = new int[n+1];
            dp[1] = 1;
            dp[2] = 1;

            return recursion(n, dp);
        }

        public int recursion(int n, int[] dp) {

            if(dp[n] != 0) return dp[n];

            dp[n] = (recursion(n - 1, dp) + recursion(n - 2, dp)) % 1234567;
            return dp[n];
        }

    }
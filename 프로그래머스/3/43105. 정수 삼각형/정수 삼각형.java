class Solution {
        public int solution(int[][] triangle) {
            int[][] dp = new int[triangle.length][triangle.length];

            dp[0][0] = triangle[0][0];

            for (int row = 1; row < triangle.length; row++) {

                for (int col = 0; col < triangle[row].length; col++) {

                    if (col == 0) {
                        dp[row][col] = triangle[row][col] + dp[row - 1][col];
                    } else if (col == triangle[row].length - 1) {
                        dp[row][col] = triangle[row][col] + dp[row - 1][col - 1];
                    } else {
                        dp[row][col] = Math.max(triangle[row][col] + dp[row-1][col-1], triangle[row][col] + dp[row-1][col]);
                    }
                }
            }

            int answer = Integer.MIN_VALUE;

            for (int[] row : dp) {
                for (int num : row) {
                    answer = Math.max(answer, num);
                }
            }

            return answer;
        }
    }
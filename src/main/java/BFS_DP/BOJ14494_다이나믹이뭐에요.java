package BFS_DP;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ14494_다이나믹이뭐에요 {


    static long dp[][];
    static int low;
    static int column;

    public static void main(String[] args) {
        input();
        initDp();
        System.out.println(dp(low, column));
    }

    private static long dp(int low, int column) {

        if(low == 0 || column == 0) return 0;
        if(low == 1 && column == 1) return 1;
        if(dp[low][column] != -1) return dp[low][column];

        long result = (dp(low, column-1) + dp(low-1, column) + dp(low-1, column-1))%1000000007;
        dp[low][column] = result;
        return result;
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        low = sc.nextInt();
        column = sc.nextInt();
    }

    private static void initDp() {
        dp = new long[low + 1][column + 1];
        for (int i = 0; i <= low; i++) {
            for (int j = 0; j <= column; j++) {
                dp[i][j] = -1;
            }
        }
    }

//    static long dp[][];
//
//    public static long dp(int n, int m) {
//        if(n == 0 || m == 0) return 0;
//        if(n == 1 && m == 1) return 1;
//        if(dp[n][m] != -1) return dp[n][m];
//
//        long result = (dp(n, m-1) + dp(n-1, m) + dp(n-1, m-1))%1000000007;
//        dp[n][m] = result;
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        dp = new long[n+1][m+1];
//        for(int i=0; i<=n; i++)
//            for(int j=0; j<=m; j++)
//                dp[i][j] = -1;
//
//        System.out.println(dp(n, m)%1000000007);
//    }
}

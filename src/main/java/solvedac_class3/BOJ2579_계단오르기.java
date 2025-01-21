package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ2579_계단오르기 {

    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            dp[i] = -1;
        }

        dp[0] = 0;
        dp[1] = arr[1];
        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        int answer = getDp(n);

        System.out.println(answer);
    }

    public static int getDp(int n) {
        if (dp[n] == -1) {

            dp[n] = Math.max(getDp(n - 3) + arr[n - 1], getDp(n - 2)) + arr[n];

        }
        return dp[n];
    }
}

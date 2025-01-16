package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ1904_01타일 {
    static int n;
    static long[] dp;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new long[1000001];

        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        long answer = tile(n);

        System.out.println(answer);
    }

    public static long tile(int n) {
        if (dp[n] == -1) {
            dp[n] = (tile(n - 1) + tile(n - 2)) % 15746;
        }
        return dp[n];
    }
}

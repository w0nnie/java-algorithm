package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ1727_2xN타일링2 {
    static int[] dp;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[1001];

        for (int i = 1; i <= 1000; i++) {
            dp[i] = -1;
        }

        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;

        int answer = getDp(n);

        System.out.println(answer);
    }

    public static int getDp(int n) {

        if (dp[n] == -1) {
            dp[n] = (getDp(n - 1) + getDp(n - 2) + getDp(n - 2)) % 10007;
        }

        return dp[n];
    }
}

package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ17626_FourSquares {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[50001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;


        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                min = Math.min(min, dp[i - j * j]);
            }

            dp[i] = min + 1;
        }

        System.out.println(dp[n]);
    }
}

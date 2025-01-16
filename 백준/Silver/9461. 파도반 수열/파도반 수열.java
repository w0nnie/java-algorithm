import java.io.*;
import java.util.*;

public class Main {
    static long[] dp;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());


        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            dp = new long[100001];
            for (int j = 0; j < n + 1; j++) {
                dp[j] = -1;
            }

            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 1;
            long answer = getDp(n -1);

            System.out.println(answer);
        }
    }

    private static long getDp(int n) {
        if (dp[n] == -1) {
            dp[n] = getDp(n - 2) + getDp(n - 3);
        }
        return dp[n];
    }
}

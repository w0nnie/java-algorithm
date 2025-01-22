import java.io.*;
import java.util.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());


        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            dp = new int[11];
            for (int j = 1; j <= n; j++) {
                dp[j] = -1;
            }

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            int answer = getDp(n);

            System.out.println(answer);
        }
    }

    public static int getDp(int n) {

        if (dp[n] == -1) {

            dp[n] = getDp(n - 1) + getDp(n - 2) + getDp(n - 3);
        }

        return dp[n];
    }
}

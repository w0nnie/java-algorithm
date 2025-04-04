import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n];
        if(n == 1) System.out.println(1);
        if(n == 2) System.out.println(1);
        if (n > 2) {
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i < n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            System.out.println(dp[n-1]);
        }
    }
}

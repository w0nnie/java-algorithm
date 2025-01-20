import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int[][] dp;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                int a = Integer.parseInt(stk.nextToken());
                arr[i][j] = a;
                dp[i][j] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }

        int answer = getDp(0, 0);
        System.out.println(answer);
    }

    public static int getDp(int row, int column) {

        if (dp[row][column] == -1) {

            dp[row][column] = Math.max(getDp(row + 1, column), getDp(row + 1, column + 1)) + arr[row][column];
        }

        return dp[row][column];
    }
}

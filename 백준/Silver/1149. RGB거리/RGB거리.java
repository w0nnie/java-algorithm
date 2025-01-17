import java.io.*;
import java.util.*;


public class Main {
    static int[][] dp;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        dp = new int[n][3];
        arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        dp[0][0] = arr[0][0];         // red
        dp[0][1] = arr[0][1];         // green
        dp[0][2] = arr[0][2];         // blue

        int answer = Math.min(getDp(n -1, 0), Math.min(getDp(n -1, 1), getDp(n -1,2)));
        System.out.println(answer);
    }

    public static int getDp(int row, int color) {

        if (dp[row][color] == 0) {
            //red
            if (color == 0) {
                dp[row][color] = Math.min(getDp(row - 1, 1), getDp(row - 1, 2)) + arr[row][color];
            } else if (color == 1) {
                dp[row][color] = Math.min(getDp(row - 1, 0), getDp(row - 1, 2)) + arr[row][color];
            } else if (color == 2) {
                dp[row][color] = Math.min(getDp(row - 1, 0), getDp(row - 1, 1)) + arr[row][color];
            }
        }
        return dp[row][color];
    }
}

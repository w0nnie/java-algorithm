import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[][] arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            stk = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(stk.nextToken()) + arr[i][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            int c = Integer.parseInt(stk.nextToken());
            int d = Integer.parseInt(stk.nextToken());
            int ans = 0;
            for (int j = a; j <= c; j++) {
                ans += arr[j][d];
            }
            for (int j = a; j <= c; j++) {
                ans -= arr[j][b - 1];
            }

            bw.write(ans + "\n");
        }

        bw.flush();
    }
}

package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ1012_유기농배추 {

    static int m;
    static int n;
    static int[][] field;
    static boolean[][] visit;
                    //상, 하, 좌, 우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());


        for (int i = 0; i < testCase; i++) {


            StringTokenizer stk = new StringTokenizer(br.readLine());
            m = Integer.parseInt(stk.nextToken());
            n = Integer.parseInt(stk.nextToken());
            field = new int[n][m];
            visit = new boolean[n][m];
            int k = Integer.parseInt(stk.nextToken());

            for (int j = 0; j < k; j++) {
                stk = new StringTokenizer(br.readLine());
                int col = Integer.parseInt(stk.nextToken());
                int row = Integer.parseInt(stk.nextToken());
                field[row][col] = 1;
            }

            int answer = 0;

            for (int row = 0; row < n; row++) {
                for (int col = 0; col < m; col++) {
                    if (field[row][col] == 1 && !visit[row][col]) {
                        getDfs(row, col);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void getDfs(int row, int col) {
        visit[row][col] =true;

        for (int i = 0; i < 4; i++) {
            int nrow = row + dy[i];
            int ncol = col + dx[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                if (field[nrow][ncol] == 1 && !visit[nrow][ncol]) {
                    getDfs(nrow, ncol);
                }
            }
        }
    }
}

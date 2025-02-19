import java.io.*;
import java.util.*;

public class Main {

    static int w;
    static int h;
    static int[][] field;
    static boolean[][] visit;
                    // 상하좌우, 11시, 1시, 7시, 5시
    static int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};
    static int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            w = Integer.parseInt(stk.nextToken());
            h = Integer.parseInt(stk.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            field = new int[h][w];
            visit = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                stk = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    field[i][j] = Integer.parseInt(stk.nextToken());
                }
            }

            int answer = 0;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (field[i][j] == 1 & !visit[i][j]) {
                        getDfs(i, j);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void getDfs(int row, int col) {
        visit[row][col] = true;

        for (int x = 0; x < 8; x++) {
            int nrow = row + dy[x];
            int ncol = col + dx[x];

            if (nrow >= 0 && nrow < h && ncol >= 0 && ncol < w) {
                if (field[nrow][ncol] == 1 && !visit[nrow][ncol]) {
                    getDfs(nrow, ncol);
                }
            }
        }
    }
}

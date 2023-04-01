
import java.util.Scanner;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; //상하좌우
    static int[] dy = {0, 0, -1, 1}; // 상하좌우
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int m = sc.nextInt(); //가로
            int n = sc.nextInt(); //세로
            int cabbageCount = sc.nextInt(); //배추 개수
            arr = new int[m][n];
            visited = new boolean[m][n];
            for (int j = 0; j < cabbageCount; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x][y] =1;
            }
            int count = 0; //구역수
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[j][k] == 1 && !visited[j][k]) {
                        dfs(j, k, m, n);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void dfs(int x, int y, int m, int n) {
        visited[x][y] = true;


        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < m && cy < n) {
                if (!visited[cx][cy] && arr[cx][cy] == 1) {
                    dfs(cx, cy, m, n);
                }
            }
        }
    }
}

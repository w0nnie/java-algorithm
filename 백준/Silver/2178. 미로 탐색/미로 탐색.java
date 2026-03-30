import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] maps = new int[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            for (int j = 0; j < m; j++) {
                maps[i][j] = line.charAt(j) - '0';
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];


            for (int i = 0; i < 4; i++) {
                int nextRow = row + dx[i];
                int nextCol = col + dy[i];


                if(nextCol < 0 || nextRow < 0 || nextRow >= n || nextCol >= m ) continue;
                if(visited[nextRow][nextCol]) continue;
                if(maps[nextRow][nextCol] == 0) continue;


                queue.offer(new int[]{nextRow, nextCol});
                visited[nextRow][nextCol] = true;
                maps[nextRow][nextCol] = maps[row][col] + 1;
            }
        }

        int answer = maps[n-1][m-1];

        System.out.println(answer);


    }

}

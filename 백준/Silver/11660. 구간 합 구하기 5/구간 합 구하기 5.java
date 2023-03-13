import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][N+1];
        int[][] sumArr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                //구간합 공식
                sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] -sumArr[i-1][j-1] + arr[i][j];
            }
        }

        for (int i = 0; i < question; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()); //2
            int y1 = Integer.parseInt(st.nextToken()); //2
            int x2 = Integer.parseInt(st.nextToken()); //3
            int y2 = Integer.parseInt(st.nextToken()); //4
            System.out.println(sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1]);

        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14501_퇴사 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        int[] days = new int[N];
        int[] costs = new int[N];
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            days[i] = Integer.parseInt(stk.nextToken());
            costs[i] = Integer.parseInt(stk.nextToken());
        }
        int answer = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            boolean[] visit = new boolean[N];
            if (i + days[i] <= N) {
                max = costs[i];
            }
            for (int j = 0; j < days[i] + i; j++) {
                if (j < N) {
                    visit[j] = true;
                }
            }

            for (int j = 0; j < N; j++) {
                if (visit[j] != true) {
                    if (days[j] + j <= N) {
                        max += costs[j];
                    }

                    for (int k = j; k < days[j] + j; k++) {
                        // visit 배열이 이미다 true이면 굳이 할필요없이 break를 해줘야할것같음.
                        if (k < N) {
                            visit[k] = true;
                        }
                    }
                }
            }
            if (max > answer) {
                answer = max;
            }
        }
        System.out.println(answer);
    }
}

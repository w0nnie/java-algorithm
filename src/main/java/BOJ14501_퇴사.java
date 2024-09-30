import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14501_퇴사 {

    static boolean[] visit;
    static int answer;
    static int[] days;
    static int[] costs;
    static int N;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        days = new int[N];
        costs = new int[N];
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            days[i] = Integer.parseInt(stk.nextToken());
            costs[i] = Integer.parseInt(stk.nextToken());
        }
        answer = 0;
        int max = 0;
        visit = new boolean[N];

        dfs(0, 0);
        System.out.println(answer);
    }

    private static void dfs(int depth, int currentProfit) {
        //종료구문 N일차로 다 차면 끝
        if (depth >= N) {
            answer = Math.max(answer, currentProfit);
            return;
        }

        // 일을 하는 경우 (depth + days[depth] <= N일 때)
        if (depth + days[depth] <= N) {
            dfs(depth + days[depth], currentProfit + costs[depth]);
        }

        // 일을 하지 않는 경우 (다음 날로 넘어감)
        dfs(depth + 1, currentProfit);
    }
}

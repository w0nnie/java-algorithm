package 수학;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1929_소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());
        // M부터 N사이의 소수들을 출력하여라
        // M == 3일때 2는 출력되면 안된다

        boolean[] numFlag = new boolean[N + 1];

        numFlag[0] = true;
        numFlag[1] = true;

        // N == 50
        // 2 ~ 7
        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i + i; j <= N; j+=i) {
                numFlag[j] = true;
            }
        }

        for (int i = M; i < numFlag.length; i++) {
            if (!numFlag[i]) {
                sb.append(i + "\n");
            }
        }

        System.out.print(sb);
    }
}


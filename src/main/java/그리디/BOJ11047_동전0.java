package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11047_동전0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken()); // 동전 갯수
        int K = Integer.parseInt(stk.nextToken()); // 총 금액
        int[] coins = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            coins[i] = Integer.parseInt(stk.nextToken());
        }

        while (K != 0) {
            for (int i = N - 1; i >= 0; i--) {
                if (coins[i] <= K) {
                    ans += K / coins[i];
                    K = K % coins[i];
                }
            }
        }

        System.out.println(ans);
    }
}

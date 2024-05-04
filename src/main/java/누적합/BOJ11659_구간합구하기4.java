package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11659_구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int[] arr = new int[n + 1];
        stk = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            if (i != 1) {
                arr[i] = Integer.parseInt(stk.nextToken()) + arr[i-1];
            }else{
                arr[i] = Integer.parseInt(stk.nextToken());
            }
        }

        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            int answer = arr[b] - arr[a - 1];
            System.out.println(answer);
        }
    }
}

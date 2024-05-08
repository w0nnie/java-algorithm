package 수학;


import java.io.*;
import java.util.*;

public class BOJ10986_나머지합구하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int num = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        long[] remain = new long[num];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[i] = Integer.parseInt(stk.nextToken());
            } else {
                arr[i] += arr[i - 1] + Integer.parseInt(stk.nextToken());
            }
            int remainNum = (int) (arr[i] % num);
            if (remainNum == 0) {
                ans++;
            }

            remain[remainNum]++;
        }
        for (int i = 0; i < remain.length; i++) {

            ans += remain[i] * (remain[i] - 1) / 2;
        }

        System.out.print(ans);
    }
}

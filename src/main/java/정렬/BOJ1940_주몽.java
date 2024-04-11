package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);
        /**
         * N의 최대 범위가 15,000이므로 정렬한 후 양끝 위치를 투포인터로 지정하여 문제를 풀었음
         *
         */
        int start = 1;
        int end = arr.length -1;
        int count = 0;

        while (start != end) {
            int sum = arr[start] + arr[end];

            if (sum < M) {
                start++;
            } else if (sum == M) {
                count++;
                start++;
            }else if (sum > M) {
                end--;
            }
        }
        System.out.println(count);
    }
}

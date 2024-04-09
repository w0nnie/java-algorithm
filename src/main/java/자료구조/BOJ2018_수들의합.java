package 자료구조;

import java.io.*;

/**
 * 1) 시작점, 끝점이 첫 번째 원소의 인덱스(0)을 가리키도록 설정.
 * 2) 현재까지의 합(s)과 m이 같으면 카운트를 증가
 * 3) 현재까지의 합(s)이 m보다 작으면 end를 1 증가 시킴.
 * 4) 현재까지의 합(s)보다 크거나 같으면 start를 1 증가 시킴.
 * 5) 모든 경우를 확인할 때 까지 2~4번의 과정을 반복.
 */

public class BOJ2018_수들의합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] += arr[i - 1] + i;
        }
        int start = 1;
        int end = 1;
        int sum;
        int count = 0;
        while (start <= N) {
            sum = arr[end] - arr[start - 1];
            if (sum == N) {
                count++;
                start++;
            } else if (sum < N) {
                end++;
            } else if (sum > N) {
                start++;
            }
        }

        System.out.println(count);
    }
}

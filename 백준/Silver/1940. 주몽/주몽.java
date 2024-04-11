import java.io.*;
import java.util.*;

public class Main {
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class BOJ10986_나머지합구하기_시간초과 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int num = Integer.parseInt(stk.nextToken());

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sum = new int[n + 1];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            sum[i] = arr[i - 1] + sum[i-1];
        }

        reverseArray(sum);

        for (int i = 0; i < n - 1; i++) {
            if (sum[i] % num == 0) {
                ans++;
            }
            for (int j = i + 1; j < n; j++) {
                if ((sum[i] - sum[j]) % num == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    private static void reverseArray(int[] sum) {
        int start = 0;
        int end = sum.length - 1;
        while (start < end) {
            int temp = sum[start];
            sum[start] = sum[end];
            sum[end] = temp;
            start++;
            end--;
        }
    }
}

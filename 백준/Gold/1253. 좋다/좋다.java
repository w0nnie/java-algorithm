import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(arr);

        for (int index = 0; index < n; index++) {
            int K = (int) arr[index];
            int i = 0;
            int j = n - 1;

            while (i<j) {
                if (i != index && j != index) {
                    if (arr[i] + arr[j] == K) {
                        ans++;
                        break;
                    } else if (arr[i] + arr[j] > K) {
                        j--;
                    } else if (arr[i] + arr[j] < K) {
                        i++;
                    }
                } else if (i == index) {
                    i++;
                } else if (j == index) {
                    j--;
                }
            }
        }

        System.out.println(ans);
    }
}
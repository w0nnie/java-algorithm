import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /**
     * 슈도코드
     * 10 5
     * 1 2 3 4 2 5 3 1 1 2
     *
     * 3
     *sum = arr[start] + arr[end]
     * sum == 5
     * count ++;
     *
     * sum > 5
     * sum -= arr[i]
     * start++
     *
     * sum < 5
     * end ++
     *
     * 4 2
     * 1 1 1 1
     *
     * 3
     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        while (true) {
            if (sum >= M) {
                sum -= arr[startIndex++];

            } else if (endIndex >= N) {
                break;
            } else { 
                sum += arr[endIndex++];
            }

            if (sum == M) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

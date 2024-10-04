import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        int[] hap = new int[N + 1];
        stk = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            hap[i] += hap[i - 1] + Integer.parseInt(stk.nextToken());
        }
        int start = 1;
        int end = 1;
        int count = 0;
        while (start <= N) {
            int rangeHap = hap[end] - hap[start - 1];

            if (rangeHap == M) {
                count++;
            }
            if (rangeHap <= M && end < N) {
                end++;
            } else {
                start++;
            }
        }
        System.out.println(count);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1654_랜선자르기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int lanLineCount = Integer.parseInt(stk.nextToken()); // 오영식이 이미 가지고 있는 랜선의 개수
        int needLanLineCount = Integer.parseInt(stk.nextToken()); // 필요한 랜선의 개수
        int[] lanLines = new int[lanLineCount];
        for (int i = 0; i < lanLineCount; i++) {
            lanLines[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lanLines);

        long max = lanLines[lanLineCount - 1];
        long min = 1;

        while (min <= max) {
            int answer = 0;
            long mid = (max + min) / 2;
            for (int i = 0; i < lanLineCount; i++) {
                answer += lanLines[i] / mid;
            }

            if (answer < needLanLineCount) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(max);
    }
}

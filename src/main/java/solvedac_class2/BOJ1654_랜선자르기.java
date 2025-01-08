package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ1654_랜선자르기 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());
        long[] lines = new long[N];

        for (int i = 0; i < N; i++) {
            lines[i] = Long.parseLong(br.readLine());
        }

        long end = Arrays.stream(lines).max().getAsLong();
        long start = 1;
        long count;
        long mid = 0;
        while (start <= end) {
            mid = (end + start) / 2;
            count = 0;

            for (int i = 0; i < lines.length; i++) {
                count += lines[i] / mid;
            }

            if (count < K) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        System.out.println(end);
    }
}

import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static int[] depths;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        arr = new int[n];
        depths = new int[m];
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(arr);

        getDfs(0, 0);
        System.out.println(sb);
    }

    public static void getDfs(int start, int depth) {
        if (depth == m) {
            for (int num : depths) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }


        for (int i = start; i < n; i++) {
            depths[depth] = arr[i];
            getDfs(i+1, depth + 1);
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] depths;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        depths = new int[m];
        arr = new int[n];
        visit = new boolean[n];
        int index = 0;
        while (stk.hasMoreTokens()) {
            arr[index] = Integer.parseInt(stk.nextToken());
            index++;
        }

        Arrays.sort(arr);

        getDfs(0);

        System.out.println(sb);
    }

    public static void getDfs(int depth) {
        if (depth == m) {

            for (int num : depths) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                depths[depth] = arr[i];
                getDfs(depth + 1);
                visit[i] = false;
            }
        }

    }
}

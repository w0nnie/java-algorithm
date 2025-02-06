import java.io.*;
import java.util.*;

public class Main {

    static int n;

    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visit = new boolean[n];
        sb = new StringBuilder();

        getDfs(0);

        System.out.println(sb);
    }

    public static void getDfs(int depth) {

        if (depth == n) {
            for (int num : arr) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visit[i - 1]) {
                visit[i - 1] = true;
                arr[depth] = i;
                getDfs(depth + 1);
                visit[i - 1] = false;
            }
        }
    }
}

package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ15656_N과M7 {

    static int n;
    static int m;
    static int arr[];
    static int depths[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        arr = new int[n];
        depths = new int[m];

        stk = new StringTokenizer(br.readLine());
        int arrIndex = 0;
        while (stk.hasMoreTokens()) {
            arr[arrIndex] = Integer.parseInt(stk.nextToken());
            arrIndex++;
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
            depths[depth] = arr[i];
            getDfs(depth + 1);
        }
    }
}

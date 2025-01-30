package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ15652_N과M4 {
    static int n;
    static int m;
    static int[] arr;
    static boolean[][] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        arr = new int[m];
        visit = new boolean[n][n];
        getDfs(1,0);
        System.out.println(sb);
    }

    public static void getDfs(int start, int depth) {

        if (depth == m) {
            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i =start; i<=n; i++){
            arr[depth] = i;
            getDfs(i, depth + 1);
        }
    }
}

package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ15649_N과M1 {

    static boolean[] visit;
    static int[] arr;
    static int n, m;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        int count = 0;
        visit = new boolean[n];
        arr = new int[m];
        getDfs(count);
    }

    public static void getDfs(int count) {
        if (count == m) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visit[i] == false) {
                arr[count] = i + 1;
                visit[i] = true;
                getDfs(count + 1);
                visit[i] = false;
            }
        }
    }
}

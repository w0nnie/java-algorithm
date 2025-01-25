import java.io.*;
import java.util.*;

public class Main {

    static boolean visit[];
    static int arr[];
    static List<int[]> list;
    static int n, m;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        arr = new int[m];
        int count = 0;

        getDfs(1, count);
    }

    public static void getDfs(int start, int count) {
        if (count == m) {

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[count] = i;
            getDfs(i + 1, count + 1);
        }
    }
}
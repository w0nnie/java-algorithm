package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ1920_수찾기 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());
        int temp = 0;
        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = n - 1;
            int findNum = Integer.parseInt(stk.nextToken());

            while (start <= end) {
                int mid = (start + end) / 2;

                if (arr[mid] == findNum) {
                    temp = 1;
                    break;
                } else if (findNum > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (temp == 1) {
                System.out.println(1);
                temp = 0;
            } else {
                System.out.println(0);
            }
        }
    }
}

package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ10814_나이순정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int n = Integer.parseInt(br.readLine());

        String[][] name = new String[n][];

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            String[] arr = new String[2];
            arr[0] = stk.nextToken();
            arr[1] = stk.nextToken();
            name[i] = arr;
        }
        /**
         * 정수로 변환하여 정렬해줘야 통과
         *     3
         *     100 A
         *     21 B
         *     11 C
         */
        Arrays.sort(name, (a,b) -> Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]))); // 정수 비교
        Arrays.sort(name, (a,b) -> a[0].compareTo(b[0])); // 문자열 비교


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < name[i].length; j++) {
                System.out.print(name[i][j] + " ");
            }
            System.out.println();
        }
    }
}

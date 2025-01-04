package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ11650_좌표정렬하기 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][];
        StringTokenizer stk;
        for(int i =0; i< N; i++){
            stk = new StringTokenizer(br.readLine());
            int[] a = new int[2];
            a[0] = Integer.parseInt(stk.nextToken());
            a[1] = Integer.parseInt(stk.nextToken());
            arr[i] = a;
        }

        Arrays.sort(arr, (a, b) -> {
            int cmp = Integer.compare(a[0], b[0]);
            return cmp != 0 ? cmp : Integer.compare(a[1], b[1]);
        });


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

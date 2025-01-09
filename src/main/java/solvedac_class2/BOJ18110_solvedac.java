package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ18110_solvedac {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        float averageCut = 0.15f;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        Arrays.sort(arr);

        int exceptionNum = Math.round(averageCut * n);
        for (int i = 0; i < exceptionNum; i++) {
            arr[i] = 0;
        }

        for (int i = arr.length - 1; i > arr.length - 1 - exceptionNum; i--) {
            arr[i] = 0;
        }

        int hap = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            hap += arr[i];
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        int answer = Math.round(hap / (float)(arr.length - zeroCount));

        System.out.println(answer);
    }
}

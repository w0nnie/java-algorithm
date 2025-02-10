package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ15658_연산자끼워넣기2 {

    static int[] arr;
    static int[] expressions;
    static int n;
    static int max;
    static int min;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        arr = new int[n];
        int arrIndex = 0;
        while (stk.hasMoreTokens()) {
            arr[arrIndex] = Integer.parseInt(stk.nextToken());
            arrIndex++;
        }

        expressions = new int[4];
        stk = new StringTokenizer(br.readLine());

        int expressionsIndex = 0;
        while (stk.hasMoreTokens()) {
            int expressionsCount = Integer.parseInt(stk.nextToken());
            expressions[expressionsIndex] = expressionsCount;
            expressionsIndex++;
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        getDfs(0, arr[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void getDfs(int depth, int score, int numIndex) {

        if (depth == n - 1) {

            if (score > max) {
                max = score;
            }

            if (score < min) {
                min = score;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (expressions[i] > 0) {
                expressions[i]--;
                int privateScore = score;
                switch (i) {
                    case 0:
                        privateScore += arr[numIndex];
                        break;
                    case 1:
                        privateScore -= arr[numIndex];
                        break;
                    case 2:
                        privateScore *= arr[numIndex];
                        break;
                    case 3:
                        privateScore /= arr[numIndex];
                        break;
                }
                getDfs(depth + 1, privateScore, numIndex + 1);
                expressions[i]++;
            }
        }
    }
}

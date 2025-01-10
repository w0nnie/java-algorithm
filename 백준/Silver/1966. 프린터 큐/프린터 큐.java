import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());

            int numCount = Integer.parseInt(stk.nextToken());
            int findNumIndex = Integer.parseInt(stk.nextToken());

            Queue<int[]> q = new LinkedList<>();;

            stk = new StringTokenizer(br.readLine());

            int[] arr = new int[numCount];
            for (int j = 0; j < numCount; j++) {

                int[] a = new int[2];
                int num = Integer.parseInt(stk.nextToken());
                a[0] = num;
                arr[j] = num;
                if (j == findNumIndex) {
                    a[1] = 1;
                }
                q.add(a);
            }

            int count = 0;
            while (true) {

                // 종료조건
                int[] poll = q.poll();
                int num = poll[1];
                boolean max = true;
                
                //가장 큰 값인지
                for (int[] curQ : q) {
                    if (curQ[0] > poll[0]) {
                        max = false;
                        break;
                    }
                }

                if (max) {
                    count++;
                    if (num == 1) {
                        System.out.println(count);
                        break;
                    }
                } else {
                    q.add(poll);
                }
            }
        }
    }
}

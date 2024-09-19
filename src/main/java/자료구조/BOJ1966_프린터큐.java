package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1966_프린터큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            stk = new StringTokenizer(br.readLine());
            int documents = Integer.parseInt(stk.nextToken()); //문서 수
            int location = Integer.parseInt(stk.nextToken());  // 찾고자 하는 문서의 위치

            stk = new StringTokenizer(br.readLine());
            Queue<int[]> queue = new LinkedList<>(); // 중요도 배열
            int index = 0;
            while (stk.hasMoreTokens()) {
                queue.add(new int[]{index, Integer.parseInt(stk.nextToken())});
                index++;
            }

            int printCount = 1;

            //처음 입력받은 문서 중요도의 location에 위치한 원소가 poll될때 count가 몇인지를 구하는 문제
            while (true) {
                int max = Integer.MIN_VALUE;
                for (int[] ints : queue) { // queue의 원소중 max값을 찾는 로직
                    int important = ints[1];
                    if (important > max) {
                        max = important;
                    }
                }

                if (queue.peek()[1] == max) {
                    int[] a = queue.poll();

                    if (a[0] == location) {
                        break;
                    }
                    printCount++;
                } else {
                    queue.add(queue.poll());
                }
            }
            System.out.println(printCount);
        }
    }
}

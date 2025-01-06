package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ2164_카드2 {


    /**
     * 1 2 3 4 5 6
     * 2 3 4 5 6
     * 3 4 5 6 2
     * 4 5 6 2
     * 5 6 2 4
     * 6 2 4
     * 2 4 6
     * 4 6
     * 6 4
     * 4
     */

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while (true) {
            // 종료 조건
            if (q.size() == 1) {
                System.out.println(q.peek());
                break;
            }
            q.poll();
            int peek = (int) q.poll();
            q.add(peek);
        }
    }
}

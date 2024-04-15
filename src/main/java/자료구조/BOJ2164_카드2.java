package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2164_카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        boolean flag = true;

        while (queue.size() > 1) {

            if (flag) {
                queue.remove(queue.peek());
                flag = false;
            } else {
                queue.add(queue.peek());
                queue.remove(queue.peek());
                flag = true;
            }
        }

        System.out.println(queue.peek());
    }
}

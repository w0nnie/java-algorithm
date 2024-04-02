import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int howManytimes = Integer.parseInt(br.readLine());
        Queue<int []> queue;

        for (int i = 0; i < howManytimes; i++) {
            stk = new StringTokenizer(br.readLine());
            queue = new LinkedList<>();
            int N = Integer.parseInt(stk.nextToken());
            int position = Integer.parseInt(stk.nextToken());

            stk = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                queue.add(new int[] {j, Integer.parseInt(stk.nextToken())});
            }
            System.out.println(method(queue, position));
        }

    }

private static int method(Queue<int []> queue, int position) {
        int count = 0;

        while (true) {
            int[] front = queue.poll();
            boolean isMax = true; // front 원소가 가장 큰 원소인지 판단하는 변수

            for (int[] curQ : queue) {
                if (front[1] < curQ[1]) {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                count++;
                if (front[0] == position) {
                    break;
                }
            }else{
                queue.add(front);
            }

        }
        return count;
    }
}

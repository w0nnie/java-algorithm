import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int howManyTime = Integer.parseInt(stk.nextToken());
        int findPosition = Integer.parseInt(stk.nextToken());
        
        Queue<Integer> queue = new LinkedList();
        IntStream.rangeClosed(1,howManyTime).forEach(queue::offer);

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 0; i < howManyTime; i++) {
            while (queue.size() > 1) {
                for (int j = 1; j < findPosition; j++) {
                    queue.offer(queue.poll());
                }
                sb.append(queue.poll() + ", ");
            }
            if (queue.size() != 0) {
                sb.append(queue.poll() + ">");
            }
        }

        System.out.println(sb);
    }
}

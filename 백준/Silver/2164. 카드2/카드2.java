import java.io.*;
import java.util.*;

public class Main {

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

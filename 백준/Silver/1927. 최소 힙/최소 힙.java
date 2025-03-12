import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            switch (a) {
                case 0:
                    if (queue.size() != 0) {
                        sb.append(queue.poll() + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                default:
                    queue.add(a);
                    break;
            }
        }
        System.out.println(sb);
    }
}

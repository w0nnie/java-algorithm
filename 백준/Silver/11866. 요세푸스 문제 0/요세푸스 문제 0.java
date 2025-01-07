import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken()) - 1;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        sb.append("<");
        while (true) {
            
            //종료조건
            int size = q.size();
            if (size == 0) {
                break;
            }

            for (int j = 0; j < K; j++) {
                Integer pollNum = q.poll();
                q.add(pollNum);
            }
            Integer removeNum = q.poll();

            if (q.size() == 0) {
                sb.append(removeNum + ">");
            } else{
                sb.append(removeNum +", ");
            }
        }

        System.out.println(sb);
    }
}

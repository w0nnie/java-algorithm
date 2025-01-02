import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(stk.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());

        for(int i = 0; i< m; i++){
            int findNum = Integer.parseInt(stk.nextToken());
            sb.append(map.getOrDefault(findNum, 0) + " ");
        }

        System.out.print(sb);
    }
}

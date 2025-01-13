import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int testCase = Integer.parseInt(br.readLine());

        for(int i =0; i < testCase; i++){
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                stk = new StringTokenizer(br.readLine());
                String key = stk.nextToken();
                String value = stk.nextToken();

                map.put(value, map.getOrDefault(value, 0) + 1);
            }

            int answer = 1;
            for (String s : map.keySet()) {
                answer *= map.get(s) + 1;
            }

            System.out.println(answer - 1);
        }
    }
}

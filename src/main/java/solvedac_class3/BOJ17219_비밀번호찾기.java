package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ17219_비밀번호찾기 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            String email = stk.nextToken();
            String passwd = stk.nextToken();

            map.put(email, passwd);
        }

        for (int i = 0; i < m; i++) {
            String question = br.readLine();

            System.out.println(map.get(question));
        }

    }
}

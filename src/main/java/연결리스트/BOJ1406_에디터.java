package 연결리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1406_에디터 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            list.add(String.valueOf(a));
        }
        int m = Integer.parseInt(br.readLine());
        int index = str.length();
        for (int i = 0; i < m; i++) {

            stk = new StringTokenizer(br.readLine());
            String method = stk.nextToken();
            switch (method) {
                case "P":
                    String input = stk.nextToken();
                    list.add(index, input);
                    index++;
                    System.out.println(list.toString());
                    break;
                case "L":
                    if (index != 0) {
                        index -= 1;
                    }
                    System.out.println(list.toString());
                    break;
                case "D":
                    if (index != list.size()) {
                        index += 1;
                    }
                    System.out.println(list.toString());
                    break;
                case "B":
                    if (index != 0) {
                        list.remove(index-1);
                        index--;
                    }
                    System.out.println(list.toString());
                    break;
            }
        }
        for (String element : list) {
            sb.append(element);
        }

        System.out.println(sb);
    }
}

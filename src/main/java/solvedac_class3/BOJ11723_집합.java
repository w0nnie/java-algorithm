package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ11723_집합 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());

            int num = 0;
            int index = 0;
            switch (stk.nextToken()) {
                case "add":
                    num = Integer.parseInt(stk.nextToken());
                    if (!list.contains(num)) {
                        list.add(num);
                    }
                    break;
                case "remove":
                    num = Integer.parseInt(stk.nextToken());
                    if (list.contains(num)) {
                        index = list.indexOf(num);
                        list.remove(index);
                    }
                    break;
                case "check":
                    int print = list.contains(Integer.parseInt(stk.nextToken())) ? 1 : 0;
                    sb.append(print + "\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(stk.nextToken());
                    if (!list.contains(num)) {
                        list.add(num);
                    } else {
                        index = list.indexOf(num);
                        list.remove(index);
                    }
                    break;
                case "all":
                    list = new ArrayList<>(
                            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
                    );
                    break;
                case "empty":
                    list.clear();
                    break;
            }
        }
        System.out.print(sb);
    }
}

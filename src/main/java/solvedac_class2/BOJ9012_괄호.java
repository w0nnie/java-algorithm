package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ9012_괄호 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Stack<String> stack = new Stack<>();
            String line = br.readLine();
            boolean flag = true;
            for (int j = 0; j < line.length(); j++) {
                String a = String.valueOf(line.charAt(j));

                //얼리아웃
                if (j == 0 && a.equals(")")) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }

                if (a.equals("(")) {
                    stack.add(a);
                } else{
                    //내 앞전에 있는 친구가 여는괄호다 -> pop()
                    // 내 앞전에 있는 친구가 닫는괄호다 -> add()
                    // 닫는괄호인데 peek()시 emptyStack expcetion
                    if (stack.empty()) {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                    String before = stack.peek();
                    if (before.equals("(")) {
                        stack.pop();
                    } else{
                        stack.add(a);
                    }
                }
            }

            //종료
            if (flag == true) {
                if (stack.empty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}

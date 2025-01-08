package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ1874_스택수열 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int index = 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(br.readLine());

            if (num >= index) {
                for (int j = index; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n");
                    index = j + 1;
                }

                stack.pop();
                sb.append("-\n");
            } else{
                Integer peek = stack.peek();
                if (peek == num) {
                    stack.pop();
                    sb.append("-\n");
                } else{
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
        }
        if(flag) System.out.println(sb);
    }
}

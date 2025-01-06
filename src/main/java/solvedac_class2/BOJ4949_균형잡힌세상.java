package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ4949_균형잡힌세상 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();

            if (line.equals(".")) {
                break;
            }
            Stack<String> stack = new Stack<>();

            for (int i = 0; i < line.length(); i++) {
                String a = String.valueOf(line.charAt(i));
                // 종료조건 .
                if (a.equals(".")) {
                    if (stack.size() == 0) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                    break;

                } else if (a.equals("(") || a.equals("[")) {
                    stack.add(a);

                } else if (a.equals(")")) {
                    if (stack.isEmpty()) {
                        System.out.println("no");
                        break;
                    }

                    String shape = stack.peek();

                    if (shape.equals("(")) {
                        stack.pop();
                    } else {
                        stack.add(a);
                    }
                } else if (a.equals("]")) {
                    if (stack.isEmpty()) {
                        System.out.println("no");
                        break;
                    }

                    String shape = stack.peek();

                    if (shape.equals("[")) {
                        stack.pop();
                    } else {
                        stack.add(a);
                    }
                }
            }
        }
    }
}

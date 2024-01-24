import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);

            if (word == '<') {
                flag = true;

                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(word);
            } else if (word == '>') {
                flag = false;
                sb.append(word);
            } else if (flag) {
                sb.append(word);
            } else if (!flag) {
                if (word == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(word);
                } else {
                    stack.push(word);
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}


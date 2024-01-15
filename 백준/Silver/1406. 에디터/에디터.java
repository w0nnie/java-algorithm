import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();
        String eng = br.readLine();

        for (int i = 0; i < eng.length(); i++) {
            char a = eng.charAt(i);
            leftStack.push(String.valueOf(a));
        }
        int howManyTime = Integer.parseInt(br.readLine());

        for (int i = 0; i < howManyTime; i++) {
            String method = br.readLine();
            char a = method.charAt(0);
            switch (a) {
                case 'L':
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case 'D':
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case 'B':
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                case 'P':
                    char t = method.charAt(2);
                    leftStack.push(String.valueOf(t));
                    break;
            }
        }
        while (!rightStack.isEmpty()) {
            leftStack.push(rightStack.pop());
        }

        for (String element : leftStack) {
            sb.append(element);
        }

        System.out.println(sb);
    }

}

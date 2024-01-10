import java.io.*;
import java.nio.Buffer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack();
        int howManyTime = Integer.parseInt(br.readLine());
        int currentlyPushNum = 0;
        for (int i = 0; i < howManyTime; i++) {
            int num = Integer.parseInt(br.readLine());

            if (currentlyPushNum == 0) {
                currentlyPushNum = num;
                for (int j = 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-");
            } else {
                if (currentlyPushNum < num) {
                    for (int j = currentlyPushNum + 1; j <= num; j++) {
                        stack.push(j);
                        sb.append("\n+");
                    }
                    stack.pop();
                    sb.append("\n-");
                    currentlyPushNum = num;
                }else{
                    if (stack.peek().equals(num)) {
                        stack.pop();
                        sb.append("\n-");
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println(sb);
        }else{
            System.out.print("NO");
        }
        br.close();
    }
}


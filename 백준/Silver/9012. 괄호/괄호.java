import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader br;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int rowCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < rowCount; i++) {
            Stack<Character> stack = new Stack<>();
            String vps = br.readLine();
            solve(stack, vps);
        }
    }

    private static void solve(Stack<Character> stack, String vps) {
        for (int j = 0; j < vps.length(); j++) {
            if (vps.charAt(j) == '(') {
                stack.push(vps.charAt(j));
            } else if (vps.charAt(j) == ')') {
                if (stack.isEmpty()) {
                    stack.push(vps.charAt(j));
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

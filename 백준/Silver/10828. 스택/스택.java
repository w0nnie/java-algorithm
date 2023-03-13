import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }

            if(command.equals("pop")){
                if(stack.size() == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.pop());
                }
            }

            if (command.equals("size")) {
                System.out.println(stack.size());
            }

            if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }

            if (command.equals("top")) {
                if (stack.size() == 0) {
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
    }
}


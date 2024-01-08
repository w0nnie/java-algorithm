import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howManyTime = Integer.parseInt(br.readLine());

        for (int i = 0; i < howManyTime; i++) {
            Stack stack = new Stack();
            String line = br.readLine();

            for (int j = 0; j < line.length(); j++) {
                char brackets = line.charAt(j);

                if (brackets == '(') {
                    stack.push(brackets);
                } else if (brackets == ')') {
                    if (stack.isEmpty()) {
                        stack.push(brackets);
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
}

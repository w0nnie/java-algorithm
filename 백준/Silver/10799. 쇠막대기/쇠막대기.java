import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    /**
     * 여는 괄호가 나오고 닫는 괄호가 나오면 레이저 '()'
     * 여는 괄호가 나오고 또 여는 괄호가 나오면 막대기 '(('
     * 닫는 괄호가 나오면 앞에 괄호가 여는 괄호면 레이저 '()'
     * 닫는 괄호가 나오면 앞에 괄호가 닫는 괄호면 막대기 '))'
     * 여는 괄호 push
     * 닫는 괄호 pop
     * 앞에 괄호 비교
     * 막대기가 늘어나면 + 1
     * 레이저면 stack의 size만큼 answer ++
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        String example = br.readLine();
        int answer = 0;
        for (int i = 0; i < example.length(); i++) {
            char word = example.charAt(i);
            if (word == '(') {
                stack.push(word);
            } else {
                stack.pop();
                if (example.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}

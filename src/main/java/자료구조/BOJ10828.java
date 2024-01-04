package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ10828 {
    /**
     * push X: 정수 X를 스택에 넣는 연산이다.
     * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * size: 스택에 들어있는 정수의 개수를 출력한다.
     * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
     * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    */
    public static List<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howManyTime = Integer.parseInt(br.readLine());

        for (int i = 0; i < howManyTime; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String work = st.nextToken();

            switch (work) {
                case "push":
                    int pushNum = Integer.parseInt(st.nextToken());
                    push(pushNum);
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "top":
                    System.out.println(top());
                    break;
            }
        }

        br.close();
    }

    static void push(int x) {
        stack.add(x);
    }

    static int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    static int size() {

        return stack.size();
    }

    static int empty() {

        return stack.isEmpty() ? 1 : 0;
    }

    static int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }
}

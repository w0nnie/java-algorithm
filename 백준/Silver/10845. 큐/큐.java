import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    /**
     * push X: 정수 X를 큐에 넣는 연산이다.
     * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * size: 큐에 들어있는 정수의 개수를 출력한다.
     * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
     * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     */
    static List<Integer> queue = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howManyTime = Integer.parseInt(br.readLine());

        for (int i = 0; i < howManyTime; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    push(num);
                    break;
                case "front":
                    System.out.println(front());
                    break;
                case "back":
                    System.out.println(back());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
            }
        }
    }

    static void push(int num) {
        queue.add(num);
    }

    static int back() {
        return queue.size() != 0 ? queue.get(queue.size() - 1) : -1;
    }

    static int size() {
        return queue.size();
    }

    static int empty() {
        return queue.size() != 0 ? 0 : 1;
    }

    static int front() {
        return queue.isEmpty() ? -1 : queue.get(0);
    }

    static int pop() {
        return queue.isEmpty() ? -1 : queue.remove(0);
    }
}

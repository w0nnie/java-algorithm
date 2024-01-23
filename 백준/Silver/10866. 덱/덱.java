import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /**
     * push_front X: 정수 X를 덱의 앞에 넣는다.
     * push_back X: 정수 X를 덱의 뒤에 넣는다.
     * pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * size: 덱에 들어있는 정수의 개수를 출력한다.
     * empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
     * front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> deque = new LinkedList<>();

        int howManyTime = Integer.parseInt(br.readLine());

        for (int i = 0; i < howManyTime; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            String method = stk.nextToken();
            int pushNum = 0;
            switch (method) {
                case "push_front":
                    pushNum = Integer.parseInt(stk.nextToken());
                    push_front(deque, pushNum);
                    break;
                case "push_back":
                    pushNum = Integer.parseInt(stk.nextToken());
                    push_back(deque, pushNum);
                    break;
                case "pop_front":
                    System.out.println(pop_front(deque));
                    break;
                case "pop_back":
                    System.out.println(pop_back(deque));
                    break;
                case "size":
                    System.out.println(size(deque));
                    break;
                case "empty":
                    System.out.println(deque.size() == 0 ? 1 : 0);
                    break;
                case "front":
                    System.out.println(deque.isEmpty() ? -1 : deque.get(0));
                    break;
                case "back":
                    System.out.println(deque.isEmpty() ? -1 : deque.get(deque.size() - 1));
                    break;
            }
        }
    }

    private static int size(List<Integer> deque) {
        return deque.size();
    }

    private static int pop_back(List<Integer> deque) {
        return deque.isEmpty() ? -1 : deque.remove(deque.size() - 1);
    }

    private static int pop_front(List<Integer> deque) {
        return deque.isEmpty() ? -1 :  deque.remove(0);
    }


    static void push_front(List<Integer> deque, int num) {
        deque.add(0, num);
    }
    private static void push_back(List<Integer> deque, int num) {
        deque.add(num);
    }
}

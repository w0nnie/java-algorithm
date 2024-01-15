package 자료구조;

import java.io.*;
import java.nio.Buffer;
import java.util.Stack;

public class BOJ1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack();
        int howManyTime = Integer.parseInt(br.readLine());
        int currentlyPushNum = 0;
        for (int i = 0; i < howManyTime; i++) {
            int num = Integer.parseInt(br.readLine());

            /**
             * 첫번째 push & pop인지 확인
             * true = currentlyPushNum = num
             * stack에 num까지 push를 쭉해줘야함
             * false = stack.최상단 확인
             * 최상단 확인해서 num이랑 !equals() No
             *
             */
            if (currentlyPushNum == 0) {
                currentlyPushNum = num;
                for (int j = 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                stack.pop(); // stack에 num이 pop이 될듯?
                sb.append("-");
            } else {
                if (currentlyPushNum < num) { //stack에 최상단값보단 num이 더 크다 즉 num까지의 자연수를 stack에 push해줘야함
                    for (int j = currentlyPushNum + 1; j <= num; j++) {
                        stack.push(j);
                        sb.append("\n+");
                    }
                    stack.pop();
                    sb.append("\n-");
                    currentlyPushNum = num;
                }else{
                    /**
                     * 최상단값보다 입력받은 값이 작다면
                     * 이미 push된 값에 최상단값인지를 체크해야한다
                     * 즉 stack의 최상단값과 == num이 같다면 pop
                     * 틀리다면 틀린 수열이다
                     */
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


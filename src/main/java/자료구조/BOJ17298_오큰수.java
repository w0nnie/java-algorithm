package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ17298_오큰수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howManyTimes = Integer.parseInt(br.readLine());
        int[] arr = new int[howManyTimes];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < howManyTimes; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        stack.push(0);
        for (int i = 1; i < howManyTimes; i++) {

            while (!stack.empty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);

        }

        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int a : arr) {
            sb.append(a + " ");
        }
        System.out.println(sb.toString());
    }
}

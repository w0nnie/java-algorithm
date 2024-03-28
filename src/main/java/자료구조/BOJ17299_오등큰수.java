package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ17299_오등큰수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howManyTimes = Integer.parseInt(br.readLine());
        int[] arr = new int[howManyTimes];
        int[] countArr = new int[howManyTimes];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < howManyTimes; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // [3, 3, 2, 1, 1, 2, 3]
        for (int i = 0; i < howManyTimes; i++) {
            int count = 1;
            for (int j = 0; j < howManyTimes; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                }
            }
            countArr[i] = count;
        }

        stack.push(0);
        for (int i = 1; i < howManyTimes; i++) {

            while (!stack.empty() && countArr[stack.peek()] < countArr[i]) {
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howManyTimes = Integer.parseInt(br.readLine());
        int[] arr = new int[howManyTimes];
        int[] countArr = new int[1_000_001];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < howManyTimes; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            countArr[arr[i]]++;
        }

        for (int i = 0; i < howManyTimes; i++) {

            while (!stack.empty() && countArr[arr[stack.peek()]] < countArr[arr[i]]) {
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

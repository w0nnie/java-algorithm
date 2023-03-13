import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[i] = temp;
        }
        int num = 1;
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int index = arr[i];
            if (index >= num) {
                while (index >= num) {
                    stack.push(num);
                    num++;
                    sb.append("+ \n");
                }
                stack.pop();
                sb.append("- \n");
            }else{
                int a = stack.pop();
                if (a > index) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }else{
                    sb.append("- \n");
                }
            }
        }
        if(flag){
            System.out.println(sb);
        }
    }
}

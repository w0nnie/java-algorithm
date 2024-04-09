import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] += arr[i - 1] + i;
        }
        int start = 1;
        int end = 1;
        int sum;
        int count = 0;
        while (start <= N) {
            sum = arr[end] - arr[start - 1];
            if (sum == N) {
                count++;
                start++;
            } else if (sum < N) {
                end++;
            } else if (sum > N) {
                start++;
            }
        }

        System.out.println(count);
    }
}
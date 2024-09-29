import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ1003_피보나치함수 {

    static int[][] d = new int[41][2];

    /**
     * [
     *  [1, 0], == 0
     *  [0, 1], == 1
     *  [0, 1], == 2
     *  [1, 2], == 3
     *
     *  20 [0,0]
     *  ...
     * ]
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] result = fibo(N);
            System.out.println(result[0] + " " + result[1]);
        }
    }

    private static int[] fibo(int n) {

        if (n == 0) {
            return new int[]{1,0};
        } else if (n == 1) {
            return new int[]{0,1};
        }
        if (d[n][0] != 0 || d[n][1] != 0) return d[n];

        return d[n] = new int[]{fibo(n - 1)[0] + fibo(n - 2)[0], fibo(n - 1)[1] + fibo(n - 2)[1]};
    }
}

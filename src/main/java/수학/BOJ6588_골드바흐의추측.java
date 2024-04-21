package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ6588_골드바흐의추측 {
    public static final int MAX = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] flag = new boolean[MAX + 1];

        for (int i = 2; i < Math.sqrt(MAX); i++) {
            for (int j = i + i; j <= MAX; j += i) {
                flag[j] = true;
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            boolean ok = false;
            if (n == 0) {
                break;
            }
            for (int i = 3; i <= n / 2; i++) {
                if (!flag[i] && !flag[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    ok = true;
                    break;
                }
            }

            if (!ok) {
                System.out.println("Goldbach's conjecture is wrong.");
            }


        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static final int MAX = 1000000; // n이 최대 1,000,000
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] flag = new boolean[MAX + 1];

        for (int i = 2; i < Math.sqrt(MAX); i++) { // 최대 인수값인 1,000,000까지의 소수를 다 구해줌
            for (int j = i + i; j <= MAX; j += i) {
                flag[j] = true;
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine()); // 그 후 n 입력받아줌
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

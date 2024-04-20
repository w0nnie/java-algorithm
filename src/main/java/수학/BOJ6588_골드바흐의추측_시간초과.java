package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ6588_골드바흐의추측_시간초과 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }else{
                boolean[] flag = new boolean[n + 1];

                flag[0] = true;
                flag[1] = true;
                flag[2] = true;
                for (int i = 2; i < Math.sqrt(n); i++) {
                    for (int j = i + i; j <= n; j+=i) {
                        flag[j] = true;
                    }
                }
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < flag.length; i++) {
                    if (!flag[i]) {
                        list.add(i);
                    }
                }

                int smallIndex = 0;
                int bigIndex = list.size() -1;
                int guessNum = 0;
                while (smallIndex < list.size()) {
                    guessNum = list.get(smallIndex) + list.get(bigIndex);
                    if (guessNum == n) {
                        System.out.println(n + " = " + list.get(smallIndex) + " + " + list.get(bigIndex));
                        break;
                    } else if (guessNum > n) {
                        bigIndex--;
                    } else if (guessNum < n) {
                        smallIndex++;
                    }
                }
            }
        }
    }
}

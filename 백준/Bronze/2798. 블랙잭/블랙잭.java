import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] cards = new int[n];
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(stk.nextToken());
        }
        int answer = 0;
        int hap;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                hap = cards[i] + cards[j];
                for(int k = j+1; k <n; k++){
                    hap += cards[k];

                    if (hap <= m) {
                        if (hap >= answer) {
                            answer = hap;
                        }
                    }
                    hap -= cards[k];
                }
            }
        }
        System.out.println(answer);
    }
}

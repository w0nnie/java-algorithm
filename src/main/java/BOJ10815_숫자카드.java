import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10815_숫자카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] hasCards = new int[N];
        int index = 0;
        while (stk.hasMoreTokens()) {
            hasCards[index] = Integer.parseInt(stk.nextToken());
            index++;
        }

        int M = Integer.parseInt(br.readLine());
        int[] checkCards = new int[M];
        int[] answer = new int[M];
        index = 0;
        stk = new StringTokenizer(br.readLine());
        while (stk.hasMoreTokens()) {
            checkCards[index] = Integer.parseInt(stk.nextToken());
            index++;
        }
        Arrays.sort(hasCards);

        for (int i = 0; i < checkCards.length; i++) {
            int max = N -1;
            int min = 0;
            int mid = (max + min) / 2;
            while (min <= max) {
                if (hasCards[mid] == checkCards[i]) {
                    answer[i] = 1;
                    break;
                } else if (hasCards[mid] < checkCards[i]) {
                    min = mid + 1;
                    mid = (max + min) / 2;
                } else {
                    max = mid - 1;
                    mid = (max + min) / 2;
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            int i1 = answer[i];
            System.out.print(i1 + " ");
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] nArr = new int[n];
        int index = 0;
        while (stk.hasMoreTokens()) {
            nArr[index] = Integer.parseInt(stk.nextToken());
            index++;
        }
        Arrays.sort(nArr);
        int m = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(stk.nextToken());
            int max = n - 1;
            int min = 0;
            while (min <= max) {
                int mid = (max + min) / 2;

                if (nArr[mid] == num) {
                    answer[i] = 1;
                    break;
                } else if (num > nArr[mid]) {
                    min = mid + 1;
                } else {
                    max = mid - 1;
                }
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}

package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 지그재그로_숫자_채우기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int num = 0;
        int[][] answer = new int[n][m];

        for (int col = 0; col < m; col++) {

            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    answer[row][col] = num;
                    num++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    answer[row][col] = num;
                    num++;
                }
            }
        }

        // 출력:
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                System.out.print(answer[row][col] + " ");
            }
            System.out.println();
        }
    }
}

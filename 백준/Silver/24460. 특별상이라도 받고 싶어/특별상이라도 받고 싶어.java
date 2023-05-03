import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[][] arr;
    public static void main(String[] args) throws IOException {
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int answer = solve(0, 0, n);
        System.out.println(answer);
    }


//    15 7 13 5
//    4 2 1 9
//    0 10 8 12
//    3 11 14 6

    private static int solve(int X, int Y, int curSize) {

        if (curSize == 1) {
            return arr[X][Y];
        }

        int nextSize = curSize / 2;
        int[] result = new int[4];
        result[0] = solve(X, Y, nextSize); // 15
        result[1] = solve(X, Y + nextSize, nextSize);
        result[2] = solve(X + nextSize, Y, nextSize);
        result[3] = solve(X + nextSize, Y + nextSize, nextSize);
        Arrays.sort(result);
        return result[1];
    }
}

import java.io.*;
import java.util.*;


public class Main {
    static int blue = 0;
    static int white = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            int index = 0;
            while (stk.hasMoreTokens()) {
                arr[i][index] = Integer.parseInt(stk.nextToken());
                index++;
            }
        }

        divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void divide(int row, int col, int size) {

        //같은색 색종이인지 구별
        if (isSingleColor(row, col, size)) {
            if (arr[row][col] == 0) {
                white++;
            }else{
                blue++;
            }
            return;
        }

        int halfSize = size / 2;

        // 2 1 3 4분면 순으로
        divide(row, col, halfSize);
        divide(row, col + halfSize, halfSize);
        divide(row + halfSize, col, halfSize);
        divide(row + halfSize, col + halfSize, halfSize);
    }


    public static boolean isSingleColor(int row, int col, int size) {

        int color = arr[row][col];

        for (int i = row; i < size + row; i++) {
            for (int j = col; j < size + col; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}

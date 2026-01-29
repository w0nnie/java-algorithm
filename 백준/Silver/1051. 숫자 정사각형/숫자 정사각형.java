import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < split.length; j++) {
                arr[i][j] = Integer.parseInt(split[j]);
            }
        }

        int size = Math.min(row, col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int maxSize = Math.min(row - i, col - j);
                compare(arr, i, j, maxSize - 1);
            }
        }
        System.out.println(answer);
    }

    public static void compare(int[][] arr, int row, int col, int size) {
        int abs = arr[row][col]; // 기준값
        if (abs == arr[row][col + size] && abs == arr[row + size][col] && abs == arr[row + size][col + size]) {
            int extent = (int) Math.pow(size + 1, 2);
            if (answer < extent) {
                answer = extent;
            }
            return;
        }
        compare(arr, row, col, size - 1);
    }
}

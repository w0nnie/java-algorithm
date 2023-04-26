import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;
    static int[] sorted;
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = i + 1;
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        sumBulmando();
    }

    private static void sumBulmando() throws IOException {
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.abs(arr[i] - sorted[i]);
        }
        System.out.println(ans);

//        bw.flush();
//        br.close();
//        bw.close();
    }
}

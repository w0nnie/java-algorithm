import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        int gdc = getGCD(a, b);
        System.out.println(gdc);
        System.out.println(a * b / gdc);
    }

    private static int getGCD(int a, int b) {

        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}

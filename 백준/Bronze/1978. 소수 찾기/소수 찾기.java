import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != 1) count += getPrimeNumber(a[i]);
        }
        System.out.println(count);
    }

    private static int getPrimeNumber(int i) {

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return 0;
            }
        }

        return 1;
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        long gcdSum;
        for (int i = 0; i < testCase; i++) {
            gcdSum = 0;
            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 1; j < arr.length - 1; j++) { // i 값 1 ~ 3    // 4 10 20 30 40 의 경우
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j] > arr[k]) {
                        gcdSum += getGCD(arr[j], arr[k]);
                    }else{
                        gcdSum += getGCD(arr[k], arr[j]);
                    }
                }
            }
            System.out.println(gcdSum);
        }
    }

    /**
     * a와 b가 있을때
     * 1. 앞에 위치한 정수가 더 커야함
     * 2. b == 0이 될때까지
     * 3.  a%b = r
     *     a = b
     *     b = r
     */
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}

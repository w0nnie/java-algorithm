import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigInteger factorial = new BigInteger("1");
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        for (int i = String.valueOf(factorial).length() - 1; i >= 0; i--) {
            char a = String.valueOf(factorial).charAt(i);
            if (a == '0') {
                answer++;
            } else {
                break;
            }
        }
        System.out.println(answer);
    }
}

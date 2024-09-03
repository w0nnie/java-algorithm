import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        BigInteger factorial = getFactorial(num);
        int zeroCount = getZeroCount(factorial);

        System.out.println(zeroCount);
    }

    private static int getZeroCount(BigInteger factorial) {
        int zeroCount = 0;
        String fatorialString = String.valueOf(factorial);
        for (int i = fatorialString.length() - 1; i >= 0; i--) {
            char temp = fatorialString.charAt(i);
            if (temp == '0') {
                zeroCount++;
            }else{
                break;
            }
        }
        return zeroCount;
    }

    private static BigInteger getFactorial(int num) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}

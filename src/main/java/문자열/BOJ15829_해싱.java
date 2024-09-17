package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ15829_해싱 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        BigInteger mod = new BigInteger("1234567891");
        BigInteger answer = new BigInteger("0");
        for (int i = 0; i < size; i++) {
            BigInteger pow = BigInteger.valueOf(31).pow(i);
            BigInteger num = new BigInteger(String.valueOf(arr[i] - '`'));
            answer = answer.add(num.multiply(pow));
        }

        System.out.println(answer.remainder(mod));
    }
}

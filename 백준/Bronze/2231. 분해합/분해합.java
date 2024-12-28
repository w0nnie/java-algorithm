import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        int a = N;
        int hap;
        int temp;

        while (a > 0) {
            int aLength = String.valueOf(a).length();
            hap = a;
            temp = a;
            for (int i = aLength - 1; i >= 0; i--) {
                int a1 = (int) (temp / Math.pow(10, i));
                hap += a1;
                temp -= a1 * Math.pow(10, i);
            }

            if (hap == N) {
                answer = a;
            }
            a--;
        }

        System.out.println(answer);
    }
}

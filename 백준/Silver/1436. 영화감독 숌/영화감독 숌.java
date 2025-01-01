import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = Integer.MAX_VALUE;

        int count = 0;
        int result = 0;
        for (int i = 666; i < max; i++) {

            if (String.valueOf(i).contains("666")) {
                count++;

                if (count == n) {
                    result = i;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}

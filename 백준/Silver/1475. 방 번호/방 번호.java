import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int[] arr = new int[10];

        for (int i = 0; i < num.length(); i++) {
            int a = num.charAt(i) - '0';
            if (a == 6 || a == 9) {
                arr[9] += 1;
            } else {
                arr[a] += 1;
            }
        }
        double temp = (double) arr[9] / 2;
        arr[9] = (int) Math.round(temp);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}

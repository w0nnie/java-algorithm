package 수학;

import java.util.Scanner;

public class BOJ10872_팩토리얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            answer *= i;
        }

        System.out.println(answer);
    }

}

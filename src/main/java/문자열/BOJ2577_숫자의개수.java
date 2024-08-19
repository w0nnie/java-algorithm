package 문자열;

import java.util.Scanner;

public class BOJ2577_숫자의개수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] answer = new int[10];

        String abc = String.valueOf(a * b * c);

        for (int i = 0; i < abc.length(); i++) {
            int e = abc.charAt(i) - '0';
            answer[e]++;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

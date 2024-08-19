package 문자열;

import java.util.Scanner;

public class BOJ10808_알파벳개수 {

    public static void main(String[] args) {
        int[] arr = new int[26];
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

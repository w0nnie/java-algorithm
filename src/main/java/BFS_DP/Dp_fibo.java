package BFS_DP;

import java.util.Scanner;

public class Dp_fibo {

    static long[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new long[10001];
        System.out.println(fibo(n));

    }

    private static long fibo(int n) {

        if (n == 0) {
            return 1;
        }
        if (n == 1 || n==2) {
            return 1;
        } else if (memo[n] != 0) {
            return memo[n];
        }
        return memo[n] =  fibo(n - 1) + fibo(n - 2);
    }
}

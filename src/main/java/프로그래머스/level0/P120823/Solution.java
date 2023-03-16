package 프로그래머스.level0.P120823;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String ans = "";
            for (int j = 1; j <= i; j++) {
                ans += "*";
            }
            System.out.println(ans);
        }
    }
}

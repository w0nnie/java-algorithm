import java.io.*;
import java.util.*;

/**
 * 슈도코드
 * a층 b호에 살려면
 * a-1층 1~ b호 까지의 거주하는 모든 사람의 합만큼의 인원이 살아야함
 * 0층부터 1호 부터
 * 0층의 i호에는 i명이 산다 ( 제일 하단층이니까 )
 * k층 n호
 * 첫줄 tc
 * 첫번쨰줄 k
 * 두번째 줄 n
 * 1 ≤ k, n ≤ 14
 */
public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int testCase;
    private static int K;
    private static int N;

    private static int[][] livePeople = new int[15][15];

    private static int ans;
    public static void main(String[] args) {
        testCase = Integer.parseInt(sc.next());
        for (int i = 0; i < testCase; i++) {
            K = Integer.parseInt(sc.next());
            N = Integer.parseInt(sc.next());
            System.out.println(logic(K,N));
        }
    }

    private static int logic(int k, int n) {
        for (int i = 0; i <livePeople.length ; i++) {
            livePeople[0][i] = i;
            livePeople[i][1] = 1;
        }

        for (int i = 1; i < livePeople.length; i++) { //K
            for (int j = 2; j < livePeople.length; j++) { //N 
                livePeople[i][j] = livePeople[i-1][j] +livePeople[i][j-1];
            }
        }

        ans = livePeople[k][n];
        return ans;
    }
}

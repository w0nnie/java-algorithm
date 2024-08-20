package 문자열;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1475_방번호 {
    /**
     *  122 -> 0~9 숫자판이 2세트가 필요해
     *  arr = 0 ~ 9 배열을 만들어
     *  arr[1] +=1
     *  arr[2] +=1
     *  arr[2] +=2
     *  배열을 한바쿠 돌면서 가장 큰 수가 필요한 세트이다
     *  중요한건 6, 9의 관계
     *
     *  ex) 9999
     *  arr[9] = 4, 답이 4인가? X
     *  6은 9로 돌려서 사용이 가능하다
     *  9가 4일때 6을 한번 체크해줘
     *  6이 카운트가 몇인지 확이야함
     *  9999
     *  :0 4 -> 2
     *  66999
     *  :2 3 -> 5 / 2 = 2.5 | 3
     *  6999
     *  :1 3 -> 4 / 2 = 2
     */

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

package 자료구조;

import java.util.Scanner;

public class BOJ11720_숫자의합구하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String sNum = sc.next(); //54321

        char[] cNum = sNum.toCharArray(); // cNum = 5,4,3,2,1

        int sum =0;

        for(int i =0; i< cNum.length; i++){
            sum+= cNum[i] - '0';
        }
        System.out.println(sum);
    }

}

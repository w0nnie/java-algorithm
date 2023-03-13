package 자료구조;

import java.util.Scanner;

public class BOJ1546_평균구하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 3
        int a[] = new int[n]; // n만큼의 사이즈 == 3

        for(int i =0; i< n; i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;

        for(int i =0; i<a.length; i++){
            if( max < a[i]){
                max = a[i];
            }
            sum += a[i];
        }
        System.out.println(sum*100.0/max/n);
    }

}

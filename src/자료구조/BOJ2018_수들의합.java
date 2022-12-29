package 자료구조;

import java.util.*;

public class BOJ2018_수들의합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int st = 1;
        int ed = 1;
        int sum = 1;
        while(ed !=n){
            if(sum == n){
                cnt++;
                ed++;
                sum += ed;
            }else if( sum > n){
                sum -= st;
                st++;
            }else{
                ed++;
                sum += ed;
            }
        }
        System.out.println(cnt);
    }

}

package solvedac_class3;

import java.io.*;
import java.util.*;

public class BOJ2748_피보나치수2 {
    static int n;
    static Long[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new Long[n + 1];

        arr[0] = 0L;
        arr[1] = 1L;

        Long answer = fibo(n);
        System.out.println(answer);
    }


    public static Long fibo(int n){
        if (arr[n] == null) {
            arr[n] = fibo(n - 1) + fibo(n - 2);
        }

        return arr[n];
    }
}

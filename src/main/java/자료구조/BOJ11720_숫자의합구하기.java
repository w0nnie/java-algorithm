package 자료구조;

import java.io.*;
import java.util.stream.*;

public class BOJ11720_숫자의합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int su = Integer.parseInt(br.readLine());
        int answer = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(answer);
    }
}


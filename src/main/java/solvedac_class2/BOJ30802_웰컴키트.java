package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ30802_웰컴키트 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int N = Integer.parseInt(br.readLine());
        int[] size = new int[6];

        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i< size.length; i++){
            size[i] = Integer.parseInt(stk.nextToken());
        }

        stk = new StringTokenizer(br.readLine());
        int shirtSize = Integer.parseInt(stk.nextToken());
        int penSize = Integer.parseInt(stk.nextToken());

        //셔츠수
        int shirtCount = 0;
        int sizeCount;
        for(int i =0; i< size.length; i++){
            sizeCount = 0;
            if (size[i] % shirtSize == 0) {
                shirtCount += size[i] / shirtSize;
            } else {
                shirtCount += (size[i] / shirtSize) + 1;
            }
            shirtCount += sizeCount;
        }

        //펜 수
        int penA = N / penSize;
        int penB = N % penSize;

        System.out.println(shirtCount);
        System.out.println(penA + " "  + penB);

    }
}

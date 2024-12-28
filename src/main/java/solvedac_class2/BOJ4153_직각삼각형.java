package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ4153_직각삼각형 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int[] tri = new int[3];
        while (true) {
            stk = new StringTokenizer(br.readLine());

            for(int i = 0; i<tri.length; i++){
                tri[i] = (int) Math.pow(Integer.parseInt(stk.nextToken()), 2);
            }

            Arrays.sort(tri);

            if (tri[0] == 0 && tri[1] == 0 && tri[2] == 0) {
                break;
            }

            if (tri[0] + tri[1] == tri[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}

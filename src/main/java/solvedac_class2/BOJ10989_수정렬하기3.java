package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ10989_수정렬하기3 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i = 0 ; i < n ; i ++){
            bw.write(arr[i]+"\n");
        }
        bw.close();
    }
}

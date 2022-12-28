package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10986_나머지합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numSize = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        long s[] = new long[numSize];
        long c[] = new long[a];
        long answer = 0;
        st = new StringTokenizer(br.readLine());
        s[0] = Integer.parseInt(st.nextToken());
        for(int i=1; i<numSize; i++){
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<numSize; i++){
            int remainder = (int)(s[i] % a); //int형 변환
            if (remainder == 0){
                answer++;
            }
            c[remainder]++;
        }
        for(int i=0; i<a; i++){
            if(c[i] > 1){
                answer = answer + (c[i] *(c[i] -1) /2);
            }
        }
        System.out.println(answer);
    }

}

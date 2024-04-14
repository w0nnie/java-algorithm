package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891_DNA비밀번호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(stk.nextToken());
        int p = Integer.parseInt(stk.nextToken());
        char[] words = br.readLine().toCharArray();
        int[] countArr = new int[4];
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            countArr[i] = Integer.parseInt(stk.nextToken());
        }
        int[] answerArr;
        int count = 0;
        int start = 0;
        int end = p - 1;
        boolean flag;
        while (end <= s - 1) {
            answerArr = new int[4];
            flag = true;
            for (int i = start; i <= end; i++) {
                switch (words[i]) {
                    case 'A':
                        answerArr[0]++;
                        break;
                    case 'C':
                        answerArr[1]++;
                        break;
                    case 'G':
                        answerArr[2]++;
                        break;
                    case 'T':
                        answerArr[3]++;
                        break;
                }
            }

            for (int i = 0; i < countArr.length; i++) {
                if (answerArr[i] < countArr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
            start++;
            end++;
        }
        System.out.println(count);
    }

}

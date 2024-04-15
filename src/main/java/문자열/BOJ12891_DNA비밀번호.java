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
        int[] answerArr = new int[4];
        int count = 0;
        int start = 0;
        int end = p;
        boolean flag = true;

        for (int i = start; i < end; i++) {
            add(words, answerArr, i);
        }
        count = checkCount(countArr, answerArr, count, flag);
        /**
         * 기존 코드에서 보안
         * 인덱스가 움직이면서 end++
         * start--
         */
        for (int i = end; i < s; i++) {
            start = i - end;
            add(words, answerArr, i);
            remove(words, answerArr, start);
            count = checkCount(countArr, answerArr, count, flag);
        }


        System.out.println(count);
    }

    private static void remove(char[] words, int[] answerArr, int i) {
        switch (words[i]) {
            case 'A':
                answerArr[0]--;
                break;
            case 'C':
                answerArr[1]--;
                break;
            case 'G':
                answerArr[2]--;
                break;
            case 'T':
                answerArr[3]--;
                break;
        }
    }

    private static int checkCount(int[] countArr, int[] answerArr, int count, boolean flag) {
        for (int i = 0; i < countArr.length; i++) {
            if (answerArr[i] < countArr[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            count++;
        }
        return count;
    }

    private static void add(char[] words, int[] answerArr, int i) {
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
}

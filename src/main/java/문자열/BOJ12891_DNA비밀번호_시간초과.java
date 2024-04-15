package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891_DNA비밀번호_시간초과 {

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
        /**
         *  시간복잡도 O(ps)로 시간 초과
         *  start 부터 end까지 index를 옮기면서
         *  각 index의 원소값이 countArr에 부합하는지 일일이 체크해주기 때문에
         *  시간초과발생
         */
        while (end <= s - 1) {  // O(p)
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

package 프로그래머스.level2.P42842;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainError {
    public static void main(String[] args) {
        System.out.println(new Solution1().solution(18,6));
    }
}

/**
 * list의 size가 홀수, 짝수
 *
 * int  a = list.size / 2
 * 홀수
 * [a,a]
 *
 * 짝수
 * [a-1, a]
 */

class Solution1 {
    public int[] solution(int brown, int yellow) {
        int a = brown + yellow;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                list.add(i);
            }
        }
        int[] answer = new int[2];
        int median  = list.size() / 2;

        if (list.size() % 2 == 0) {
            for (int i = 0; i <= 1; i++) {
                answer[i] = list.get(median - i);
            }
        } else {
            for (int i = 0; i <= 1; i++) {
                answer[i] = list.get(median);
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

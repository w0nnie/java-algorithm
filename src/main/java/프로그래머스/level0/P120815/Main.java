package 프로그래머스.level0.P120815;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(4));
    }
}

/**
 * 간단한 문제이다
 * pizza 조각인 6과 매개변수로 넘어온 n의 최소공배수를 찾으면되는 문제
 *
 */
class Solution {
    public int solution(int n) {
        int answer = 1;
        int pizza = 6;
        while (true) {
            if ((answer * pizza) % n == 0) {
                break;
            }
            answer += 1;
        }

        return answer;
    }
}
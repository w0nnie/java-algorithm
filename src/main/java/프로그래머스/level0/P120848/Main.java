package 프로그래머스.level0.P120848;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1));
    }
}

/**
 *
 */

class Solution {
    public int solution(int n) {
        int answer = 1;
        int temp = 1;
        while (true) {
            if (temp == n) {
                return answer;
            } else if (temp > n) {
                return answer - 1;
            }
            answer += 1;
            temp *= answer;
        }
    }
}
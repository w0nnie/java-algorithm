package 프로그래머스.level1.P12910;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        System.out.println(new Solution().solution(arr, 5));
    }
}


class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        int[] emptyAnswer = {-1};
        return answer.length == 0 ? emptyAnswer : answer;
    }
}
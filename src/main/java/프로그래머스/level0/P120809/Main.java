package 프로그래머스.level0.P120809;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(new Solution().solution(numbers));
    }
}

class Solution {
    public int[] solution(int[] numbers) {
//        Arrays.stream(numbers).map(i -> i * 2).toArray();
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}



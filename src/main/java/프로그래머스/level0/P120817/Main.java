package 프로그래머스.level0.P120817;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(new Solution().solution(numbers));
    }
}

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}



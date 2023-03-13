package 프로그래머스.level0.P120831;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(4));
    }
}

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(1,n)
                .filter(i -> i % 2 ==0)
                .sum();
    }
}

package 프로그래머스.level0.P120826;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcdef", "f"));
    }
}

class Solution {
    public String solution(String my_string, String letter) {
        String[] ans = my_string.split("");
        String answer = Arrays.stream(ans).filter(i -> !i.equals(letter)).collect(Collectors.joining());
        return answer;
    }
}
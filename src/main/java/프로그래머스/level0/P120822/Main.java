package 프로그래머스.level0.P120822;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello"));
    }
}

class Solution {
    public String solution(String my_string) {
        String[] split = my_string.split("");
        Collections.reverse(Arrays.asList(split));
        return Arrays.stream(split).collect(Collectors.joining());
    }
}
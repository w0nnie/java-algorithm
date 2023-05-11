package 프로그래머스.level2.P12939;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1 2 3 4"));
    }
}

class Solution {
    public String solution(String s) {
        String[] temp = s.split(" ");
        int max = Arrays.stream(temp).mapToInt(x -> Integer.parseInt(x)).max().orElseThrow(NoSuchElementException::new);
        int min = Arrays.stream(temp).mapToInt(x -> Integer.parseInt(x)).min().orElseThrow(NoSuchElementException::new);
        String answer = min + " " + max;
        return answer;
    }
}




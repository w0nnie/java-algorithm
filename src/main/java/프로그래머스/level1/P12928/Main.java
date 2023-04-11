package 프로그래머스.level1.P12928;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(12));
    }
}

/**
 * stream 사용하여 풀이 rangeClosed로 1~ n까지 열어주고 filter로 조건주고 sum 으로 더하여 return
 */

class Solution {
    public int solution(int n) {
        int answer = IntStream.rangeClosed(1,n).filter(i -> n %i == 0).sum();
        return answer;
    }
}



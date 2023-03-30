package 프로그래머스.level0.P120896;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello"));
    }
}

/**
 * 좋지못한 코드다
 * stream을 이용해 매개변수로 들어온 s를
 * charAt으로 쪼개서
 * s에 char 가 몇건 포함되어있는지 카운트를 구했고
 * 해당 카운트가 1인 값들만 answer 더해주고
 * sorting하였다
 */
class Solution {
    public String solution(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int count = (int) s.chars()
                    .filter(c -> c == a)
                    .count();
            if (count == 1) {
                answer += a;
            }
        }
        answer = Stream.of(answer.split(""))
                .sorted()
                .collect(Collectors.joining());
        return answer;
    }
}
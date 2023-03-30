import java.util.stream.Collectors;
import java.util.stream.Stream;

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
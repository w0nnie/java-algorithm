import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String[] split = my_string.split("");
        String answer = Arrays.asList(split).stream().distinct().collect(Collectors.joining());

        return answer;
    }
}
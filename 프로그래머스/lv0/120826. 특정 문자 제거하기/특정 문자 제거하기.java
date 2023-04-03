import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, String letter) {
        String[] ans = my_string.split("");
        String answer = Arrays.stream(ans).filter(i -> !i.equals(letter)).collect(Collectors.joining());
        return answer;
    }
}
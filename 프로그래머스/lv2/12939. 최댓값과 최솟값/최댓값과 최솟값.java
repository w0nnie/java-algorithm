import java.util.Arrays;
import java.util.NoSuchElementException;

class Solution {
    public String solution(String s) {
        String[] temp = s.split(" ");
        int max = Arrays.stream(temp).mapToInt(x -> Integer.parseInt(x)).max().orElseThrow(NoSuchElementException::new);
        int min = Arrays.stream(temp).mapToInt(x -> Integer.parseInt(x)).min().orElseThrow(NoSuchElementException::new);
        String answer = min + " " + max;
        return answer;
    }
}
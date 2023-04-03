import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        String[] split = my_string.split("");
        Collections.reverse(Arrays.asList(split));
        return Arrays.stream(split).collect(Collectors.joining());
    }
}
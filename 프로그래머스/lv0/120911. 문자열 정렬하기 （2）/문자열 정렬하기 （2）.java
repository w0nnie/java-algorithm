import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.toLowerCase().split("");

        return Arrays.asList(arr).stream().sorted().collect(Collectors.joining());
    }

}
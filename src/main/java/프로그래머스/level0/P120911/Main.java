package 프로그래머스.level0.P120911;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("Bcad"));
    }
}

/**
 * stream을 사용하여 간결하게 구현하고자 고민했다.
 * 아직 stream에 대해서 명확하게 이해가 되지않는것같다.
 * 인자값으로 들어온 my_string을 string[]에 split으로 쪼꺠고 소문자로 변환후 집어넣는다
 * string[]을 arrays.asList를 통해 arrayList형태로 변환후 stream을 이용해 정렬, joining을 이용해
 * list안에 값들을 붙여준 후 return 해줬다.
 */
class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.toLowerCase().split("");

        return Arrays.asList(arr).stream().sorted().collect(Collectors.joining());
    }

}
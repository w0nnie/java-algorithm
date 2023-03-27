package 프로그래머스.level0.P120888;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("people"));
    }
}

/**
 * 처음 짠 코드에서는 매겨변수로 넘어온 my_String을 split하여 Stirng[]에 저장후
 * 다시 List로 변환후
 * list로 Stream을 열어 중복제거, collect로 이어붙여줬는데
 * 굳이그럴 필요가없었다
 * String[] 은 전혀 필요하지도 않았고
 * 배열이 필요하지않으니 asList를 쓸필요도 없었다.
 */

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}

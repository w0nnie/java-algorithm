package 프로그래머스.level0.P120886;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("idllo","hello"));
    }
}

/**
 * temp 임시 스트링 변수를 만들어 매겨변수로 들어온 before를 char로 쪼개 맨 끝 인덱스부터 붙여줬다
 * 말그대로 역순부터 재배치하였다
 * 문제에서 재시한 after변수와 같아야하기떄문에 string에 equals메서드를 이용해 같다면 1 틀리다면 0을 리턴
 */

class Solution {
    public int solution(String before, String after) {
        List<Character> beforeList = new ArrayList<>();
        for (int i = 0; i < before.length(); i++) {
            char a = before.charAt(i);
            beforeList.add(a);
        }

        List<Character> afterList = new ArrayList<>();
        for (int i = 0; i < after.length(); i++) {
            char a = after.charAt(i);
            afterList.add(a);
        }

        beforeList.sort(null);
        afterList.sort(null);
        if (beforeList.equals(afterList)) {
            return  1;
        }else{
            return 0;

        }
    }
}

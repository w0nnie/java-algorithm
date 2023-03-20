package 프로그래머스.level0.P120834;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(100));
    }
}

/**
 * hashmap을 이용하였다
 * 0~9 까지 map에 위치값에 해당하는 알파벳들을 벨류값으로 넣고
 * 매겨변수로 들어온 age를 string -> char 로 캐스팅 하여
 * map.get(key) 값으로 접근하여 원하는 value값을 찾고
 * return 타입인 answer에 붙여 return 하였다.
 */
class Solution {
    public String solution(int age) {
        String ageString = String.valueOf(age);
        Map<Integer, String> map = new HashMap<>(){{
                put(0, "a");
                put(1, "b");
                put(2, "c");
                put(3, "d");
                put(4, "e");
                put(5, "f");
                put(6, "g");
                put(7, "h");
                put(8, "i");
                put(9, "j");
            }};

        String answer = "";
        for (int i = 0; i < ageString.length(); i++) {
            char a = ageString.charAt(i);
            answer += map.get(Integer.parseInt(String.valueOf(a)));
        }
        return answer;
    }
}
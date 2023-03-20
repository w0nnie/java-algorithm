import java.util.HashMap;
import java.util.Map;

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
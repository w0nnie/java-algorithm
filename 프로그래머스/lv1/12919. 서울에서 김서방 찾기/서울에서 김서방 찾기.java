import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int kimPosition = Arrays.asList(seoul).indexOf("Kim");
        String answer = "김서방은 " + kimPosition + "에 있다";
        return answer;
    }
}
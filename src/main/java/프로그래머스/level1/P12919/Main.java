package 프로그래머스.level1.P12919;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] temp = {"Jane", "Kim"};
        System.out.println(new Solution().solution(temp));
    }
}



class Solution {
    public String solution(String[] seoul) {
        int kimPosition = Arrays.asList(seoul).indexOf("Kim");
        String answer = "김서방은 " + kimPosition + "에 있다";
        return answer;
    }
}
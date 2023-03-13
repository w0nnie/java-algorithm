package 프로그래머스.level0.P120892;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("dfjardstddetckdaccccdegk",4));
    }
}

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code; i < cipher.length() + 1; i++) {
            if(i % code == 0){
                answer += cipher.charAt(i-1);
            }
        }
        return answer;
    }
}
package 프로그래머스.level1.P12931;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(123));
    }
}


class Solution {
    public int solution(int n) {
        String n1 = String.valueOf(n);
        int answer = 0;
        for (int i = 0; i < n1.length(); i++) {
            char a = n1.charAt(i) ;
            answer += a - '0';
        }
        return answer;
    }
}



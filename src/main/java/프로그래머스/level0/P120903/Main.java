package 프로그래머스.level0.P120903;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(new Solution().solution(s1, s2));
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s2.length; i++) {
            for (int j = 0; j < s1.length; j++) {
                if (s1[j].equals(s2[i])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
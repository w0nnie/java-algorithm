package 프로그래머스.level1.P87389;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
    }
}



class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i == 1)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}


package 프로그래머스.level0.P120846;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int sqrt = (int) Math.sqrt(i);
            int temp = 0;
            int x = 1;
            while (x <= sqrt) {
                if (i % x == 0) {
                    temp++;
                    if (i / x != x) {
                        temp++;
                    }
                }
                x++;
            }
            if (temp >= 3) {
                answer++;
            }
        }
        return answer;
    }
}
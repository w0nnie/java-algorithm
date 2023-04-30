package 프로그래머스.level1.P12912;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 5));
    }
}


class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a == b) {
            return a;
        }
        else if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (b < a) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        return answer;
    }
}



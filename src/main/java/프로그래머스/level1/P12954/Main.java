package 프로그래머스.level1.P12954;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(214748364,1));
    }
}


class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++) {
            answer[i-1] = (long) i * x;
        }
        return answer;
    }
}



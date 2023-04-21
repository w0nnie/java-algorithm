package 프로그래머스.level1.P12934;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7));
    }
}


class Solution {
    public long solution(long n) {
        long answer = (long) Math.sqrt(n) * (long) Math.sqrt(n) != n ? -1 : ((long) Math.sqrt(n) + 1) * ((long) Math.sqrt(n) + 1);
        return answer;
    }
}



package 프로그래머스.level0.P120830;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(9,3));
    }
}

class Solution {
    public int solution(int n, int k) {
        return n >= 10 ? n * 12000 + (k - n/10) * 2000 : n * 12000 + k * 2000;
    }
}


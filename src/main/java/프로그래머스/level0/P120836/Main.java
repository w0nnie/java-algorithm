package 프로그래머스.level0.P120836;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(100));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                answer++;
                if (i != n / i) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
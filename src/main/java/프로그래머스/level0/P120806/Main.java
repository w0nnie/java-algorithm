package 프로그래머스.level0.P120806;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7,3));
    }
}

class Solution {
    public double solution(int num1, int num2) {
        int answer = (int)((float) num1 / num2 * 1000);
        return answer;
    }
}



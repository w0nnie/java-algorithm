package 프로그래머스;

public class 두_수의_합 {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(1, 2));
    }
}


class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
}
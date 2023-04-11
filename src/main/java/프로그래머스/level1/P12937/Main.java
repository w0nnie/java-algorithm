package 프로그래머스.level1.P12937;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3));
    }
}



class Solution {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : " Odd";
    }
}



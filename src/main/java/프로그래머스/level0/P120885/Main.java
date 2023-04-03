package 프로그래머스.level0.P120885;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("10","11"));
    }
}


class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2), 2);
    }
}


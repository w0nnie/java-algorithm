package 프로그래머스.level0.P120841;

public class Main {
    public static void main(String[] args) {
        int[] dot = {2, 4};
        System.out.println(new Solution().solution(dot));
    }
}

class Solution {
    public int solution(int[] dot) {
        return dot[0] >= 1 && dot[1] >= 1 ? 1 : dot[0] >= 1 && dot[1] < 0 ? 4 : dot[0] < 0 && dot[1] >= 1 ? 2 : 3;
    }
}

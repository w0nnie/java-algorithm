package 프로그래머스.level0.P120583;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        System.out.println(new Solution().solution(array, 1));
    }
}

class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}



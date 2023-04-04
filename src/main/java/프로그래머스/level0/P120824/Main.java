package 프로그래머스.level0.P120824;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(new Solution().solution(num_list));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {(int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(num_list).filter(i -> i % 2 != 0).count()};
        return answer;
    }
}
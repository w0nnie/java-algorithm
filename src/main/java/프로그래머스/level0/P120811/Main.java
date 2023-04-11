package 프로그래머스.level0.P120811;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(new Solution().solution(array));
    }
}

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        int answer = array[array.length/2];
        return answer;
    }
}
package 프로그래머스.level0.P120833;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(new Solution().solution(numbers, 1, 3));
    }
}

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}

package 프로그래머스.level1.P12944;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new Solution().solution(nums));
    }
}



class Solution {
    public double solution(int[] arr) {
        double answer = Arrays.stream(arr).average().getAsDouble();
        return answer;
    }
}



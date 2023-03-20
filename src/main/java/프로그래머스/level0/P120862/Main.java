package 프로그래머스.level0.P120862;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 5, 5, 20, 5};
        System.out.println(new Solution().solution(numbers));
    }
}
/**
 * 매개변수로 넘어온 numbers int배열을 sort한 후
 * ansArray에 담아주고 가장 작은 수 (음수 * 음수 = 양수) 2개와
 * 가장 큰수 2개를 비교 하여 answer로 넣어준 후 return 해줬다
 */
class Solution {
    public int solution(int[] numbers) {
        int[] ansArray = Arrays.stream(numbers).sorted().toArray();
        int answer = 0;
        if (ansArray[0] * ansArray[1] > ansArray[ansArray.length - 1] * ansArray[ansArray.length - 2]) {
            answer = ansArray[0] * ansArray[1];
            return answer;
        }
        answer = ansArray[ansArray.length - 1] * ansArray[ansArray.length - 2];
        return answer;
    }
}
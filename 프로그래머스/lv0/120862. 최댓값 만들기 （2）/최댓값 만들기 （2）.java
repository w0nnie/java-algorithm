import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] ansArray = Arrays.stream(numbers).sorted().toArray();
        for (int i = 0; i < ansArray.length; i++) {
            System.out.print(ansArray[i] + " ");
        }
        int answer = 0;
        if (ansArray[0] * ansArray[1] > ansArray[ansArray.length - 1] * ansArray[ansArray.length - 2]) {
            answer = ansArray[0] * ansArray[1];
            return answer;
        }
        answer = ansArray[ansArray.length - 1] * ansArray[ansArray.length - 2];
        return answer;
    }
}
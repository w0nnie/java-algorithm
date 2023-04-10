import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int pokemonCount = nums.length / 2;
        int temp = (int) Arrays.stream(nums).boxed().distinct().count();
        int answer = pokemonCount >= temp ? temp : pokemonCount;
        return answer;
    }
}
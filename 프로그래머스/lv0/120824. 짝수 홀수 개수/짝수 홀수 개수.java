import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {(int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(num_list).filter(i -> i % 2 != 0).count()};
        return answer;
    }
}
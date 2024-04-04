import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> compeareList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> numbersList = IntStream.of(numbers).boxed().collect(Collectors.toList());
        int answer = 0;

        for (Integer compareNum : compeareList) {
            if (!numbersList.contains(compareNum)) {
                answer += compareNum;
            }
        }
        return answer;
    }
}
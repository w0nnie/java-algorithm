import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        if (direction.equals("left")) {
            for (int i = 0; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        int max = Collections.max(list);
        int index = list.indexOf(max);

        int[] answer = {max, index};
        return answer;
    }
}
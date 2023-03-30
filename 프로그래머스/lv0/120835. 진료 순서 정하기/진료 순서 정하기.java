import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> emergencyList
                = Arrays.stream(emergency)
                .boxed()
                .collect(Collectors.toList());

        int[] answer = new int[emergency.length];
        int priority = 1;
        for (int i = 0; i < emergencyList.size(); i++) {
            int max = Collections.max(emergencyList);
            int index = emergencyList.indexOf(max);
            emergencyList.set(index, 0);
            answer[index] = priority;
            priority++;
        }

        return answer;
    }
}
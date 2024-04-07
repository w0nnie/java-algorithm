import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int brown, int yellow) {
        int hap = brown + yellow;
        List<Integer> yaksu = new ArrayList<>();
        for (int i = 1; i <= hap; i++) {
            if (hap % i == 0) {
                yaksu.add(i);
            }
        }

        int[] answer = new int[2];
        for (int i = 0; i < yaksu.size(); i++) {
            for (int j = 0; j < yaksu.size(); j++) {
                int brownRule = (yaksu.get(i) * 2) + ((yaksu.get(j) - 2) * 2);
                int yellowRule = (yaksu.get(i) - 2) * (yaksu.get(j) - 2);
                if (brownRule == brown && yellowRule == yellow) {
                    answer[0] = yaksu.get(i);
                    answer[1] = yaksu.get(j);
                    break;
                }
            }
        }
        return answer;
    }
}
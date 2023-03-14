import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            int a = numlist[i];
            if (a % n == 0) {
                list.add(a);
            }
        }
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}
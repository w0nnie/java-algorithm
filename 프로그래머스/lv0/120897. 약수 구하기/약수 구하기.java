import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int sqrt = (int) Math.sqrt((double) n);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (1 != n) {
            list.add(n);
        }
        int i = 2;
        while (i <= sqrt) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n/i);
                }
            }
            i++;
        }
        Collections.sort(list);
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}
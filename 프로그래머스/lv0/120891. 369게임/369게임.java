import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int order) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < String.valueOf(order).length(); i++) {
            list.add((int) String.valueOf(order).charAt(i) - '0');
        }
        int answer = (int) list.stream().filter(x -> x == 3 || x == 6 || x == 9).count();
        return answer;
    }
}
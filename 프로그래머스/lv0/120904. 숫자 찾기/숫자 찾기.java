import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int num, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            char a = String.valueOf(num).charAt(i);
            list.add((int) a -'0');
        }
        int answer = list.indexOf(k) != - 1 ?  list.indexOf(k) + 1 : list.indexOf(k);
        return answer;
    }
}
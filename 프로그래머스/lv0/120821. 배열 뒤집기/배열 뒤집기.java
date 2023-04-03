import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> ans = new ArrayList<>();

        for (int i = num_list.length -1 ; i >= 0 ; i--) {
            ans.add(num_list[i]);
        }
        return ans.stream().mapToInt(n -> (int) n).toArray();
    }
}
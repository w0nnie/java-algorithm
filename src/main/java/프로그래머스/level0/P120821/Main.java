package 프로그래머스.level0.P120821;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(new Solution().solution(num_list));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> ans = new ArrayList<>();

        for (int i = num_list.length -1 ; i >= 0 ; i--) {
            ans.add(num_list[i]);
        }
        return ans.stream().mapToInt(n -> (int) n).toArray();
    }
}
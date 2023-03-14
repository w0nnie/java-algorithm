package 프로그래머스.level0.P120905;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numlist = new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(new Solution().solution(3, numlist));
    }
}

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
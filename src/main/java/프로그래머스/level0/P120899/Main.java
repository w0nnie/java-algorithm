package 프로그래머스.level0.P120899;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 8, 3};
        System.out.println(new Solution().solution(array));
    }
}

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
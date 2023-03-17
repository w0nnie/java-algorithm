package 프로그래머스.level0.P120850;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hi12392"));
    }
}

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (a <= 57 && a >= 48) {
                list.add((int) a - '0');
            }
        }
        Collections.sort(list);
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
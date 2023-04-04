package 프로그래머스.level0.P120854;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(new Solution().solution(strlist));
    }
}

class Solution {
    public int[] solution(String[] strlist) {
        return  Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}

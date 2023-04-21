package 프로그래머스.level1.P12947;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
    }
}


class Solution {
    public boolean solution(int x) {
        String[] temp = String.valueOf(x).split("");
        int divide = 0;
        for (int i = 0; i < temp.length; i++) {
            divide += Integer.parseInt(temp[i]);
        }
        return x % divide == 0 ? true : false;
    }
}



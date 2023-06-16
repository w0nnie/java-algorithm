package 프로그래머스.level2.P12973;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("baabaa"));
    }
}


class Solution {
    public int solution(String str) {
        String[] split = str.split("");
        Stack<String> stack = new Stack<>();

        for (String s : split) {
            if (!stack.isEmpty() && stack.peek().equals(s)) {
                stack.pop();
            } else {
                stack.push(s);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}


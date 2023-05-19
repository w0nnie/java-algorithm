package 프로그래머스.level2.P12909;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("()()"));
    }
}

class Solution {
    boolean solution(String s) {
        Stack stack = new Stack();

        if(s.length() % 2 !=0){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c =='(') {
                stack.push(c);
            } else{
                if(stack.isEmpty()) return false;
                if (stack.peek().equals('(')) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}



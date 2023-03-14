package 프로그래머스.level0.P120893;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("cccCCC"));
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (Character.isUpperCase(a)) {
                a =Character.toLowerCase(a);
            }else{
                a =Character.toUpperCase(a);
            }
            answer += a;
        }
        return answer;
    }
}
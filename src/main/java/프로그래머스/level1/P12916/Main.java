package 프로그래머스.level1.P12916;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("zxc"));
    }
}



class Solution {
    boolean solution(String s) {
        String x = s.toLowerCase();
        System.out.println(x);
        int p = 0;
        int y = 0;

        for (int i = 0; i < x.length(); i++) {
            char a = x.charAt(i);
            if (a == 'p') {
                p++;
            } else if (a == 'y') {
                y++;
            }
        }
        return p == y ? true : false;
    }
}

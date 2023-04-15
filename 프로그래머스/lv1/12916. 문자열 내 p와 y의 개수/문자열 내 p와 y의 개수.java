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
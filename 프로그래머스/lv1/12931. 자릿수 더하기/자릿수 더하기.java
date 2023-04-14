import java.util.*;

class Solution {
    public int solution(int n) {
        String n1 = String.valueOf(n);
        int answer = 0;
        for (int i = 0; i < n1.length(); i++) {
            char a = n1.charAt(i) ;
            answer += a - '0';
        }
        return answer;
    }
}

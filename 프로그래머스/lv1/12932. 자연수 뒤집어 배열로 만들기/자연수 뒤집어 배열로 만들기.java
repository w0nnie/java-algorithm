import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(long n) {
        String[] temp = String.valueOf(n).split("");
        int[] answer = new int[temp.length];
        int j = 0;
        for (int i = temp.length-1; i >= 0; i--) {
            answer[j] = Integer.parseInt(temp[i]);
            j++;
        }
        return answer;
    }
}
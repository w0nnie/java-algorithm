import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        return  Arrays.stream(strlist).mapToInt(n -> n.length()).toArray();
    }
}
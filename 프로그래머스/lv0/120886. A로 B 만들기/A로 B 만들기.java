import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String before, String after) {
        List<Character> beforeList = new ArrayList<>();
        for (int i = 0; i < before.length(); i++) {
            char a = before.charAt(i);
            beforeList.add(a);
        }

        List<Character> afterList = new ArrayList<>();
        for (int i = 0; i < after.length(); i++) {
            char a = after.charAt(i);
            afterList.add(a);
        }

        beforeList.sort(null);
        afterList.sort(null);
        if (beforeList.equals(afterList)) {
            return  1;
        }else{
            return 0;

        }
    }
}
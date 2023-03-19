import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            list.add(String.valueOf(a));
        }
        String switch1 = list.get(num1);
        String switch2 = list.get(num2);

        if (num1 > num2) {
            list.remove(num1);
            list.remove(num2);
            list.add(num2, switch1);
            list.add(num1, switch2);
        }else{
            list.remove(num2);
            list.remove(num1);
            list.add(num1, switch2);
            list.add(num2, switch1);
        }

        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}
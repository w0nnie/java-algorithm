package 프로그래머스.level0.P120895;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("I love you", 6,3));
    }
}

/**
 * 좋은 풀이라고는 못하겠다
 * List 컬렉션을 사용하였고
 * charAt을 사용하여 인자값으로 들어온 my_string의 한글자씩 쪼개 list로 add하였다.
 * num1, num2 index값에 위치한 string 값을 구하였고
 * num1, num2 중 더 큰수 (index가 더 높은 수) 를 비교해
 * remove,add를 나누어 적용하였다
 * return 형태인 string으로 값을 담아 출력하였다.
 */
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
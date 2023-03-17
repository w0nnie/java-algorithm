package 프로그래머스.level0.P120850;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hi12392"));
    }
}

/**
 * 문제에서 return 타입을 명시해줬다
 * Collections.sort와
 * stream을 사용해보기위해
 * List<Integer> 타입의 arrayList를 만들어
 * 0~9 아스키코드값에 해당하는지 범위를 찾고
 * 해당한다면 '0'을 뺴줘서 다시 숫자 형태로 변환 후
 * list에 담아줬다
 *
 * Collection으로 sort를 하고
 * solution 메서드에 return으로 명시되어있는 int[] 형태로 변환해줘야하는데
 * 이 과정에서 stream을 사용해보았다.
 *
 * stream은 개념을 잘 잡아야할것같다.
 */
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (a <= 57 && a >= 48) {
                list.add((int) a - '0');
            }
        }
        Collections.sort(list);
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
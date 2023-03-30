package 프로그래머스.level0.P120835;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        System.out.println(new Solution().solution(emergency));
    }
}

/**
 * 값을 넣었다 뻇다 쉽게 하기 위해 emergency 배열을 arrayList로 복사해주고
 * answer 배열을 만들어준다 size는 매겨변수로 들어온 emergency의 길이와 똑같다.
 * 나같은 경우 우선순위라는 int형 변수를 만들어주었고 해당 변수로
 * emergencyList에서 max값을 도출해 해당값을 이용해 index를 찾고
 * answer배열의 index에 우선순위 값을 넣어줬다.
 * 그리고 방금 전 찾은 emergencyList의 max값을 0으로 변경해줬다.
 * 우선순위를 1증가시켜 다음 긍급우선순위값을 찾는다.
 */
class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> emergencyList
                = Arrays.stream(emergency)
                .boxed()
                .collect(Collectors.toList());

        int[] answer = new int[emergency.length];
        int priority = 1;
        for (int i = 0; i < emergencyList.size(); i++) {
            int max = Collections.max(emergencyList);
            int index = emergencyList.indexOf(max);
            emergencyList.set(index, 0);
            answer[index] = priority;
            priority++;
        }

        return answer;
    }
}
package 프로그래머스.level0.P120844;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(new Solution().solution(numbers,"right"));
    }
}

/**
 * direction에 따라 2경우를 나누어서 풀었다
 * right의 경우 numbers[nubers.length] 값이 맨 앞으로 이동하게된다
 * left의 경우 numbers[0] 값이 맨 뒤로 이동하게 된다
 * 배열보다는 arrayList가 더 편하기때문에
 * list를 만들어 진행하였다
 * 문제에 return 타입이 명시되어있기때문에
 * int[]로 다시 변환해주는 작업으로 마무리하였다.
 */
class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        if (direction == "right") {
            for (int i = 0; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        if (direction == "left") {
            for (int i = 0; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}
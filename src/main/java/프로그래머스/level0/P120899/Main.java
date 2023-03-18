package 프로그래머스.level0.P120899;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 8, 3};
        System.out.println(new Solution().solution(array));
    }
}

/**
 * Integer 타입의 arrayList를 하나 만들어주고
 * 인자값으로 들어온 array에 있는 원소값들을
 * 다 add 해준 후
 * Collections.max 메서드를 이용하여 list의 max값을 찾아줬다
 * 해당 max값으로 max값이 위치한 index를 list의 indexOf 메서드를 통해 찾았다
 * answer int배열에 max,index를 넣어준 후 return
 */
class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        int max = Collections.max(list);
        int index = list.indexOf(max);

        int[] answer = {max, index};
        return answer;
    }
}
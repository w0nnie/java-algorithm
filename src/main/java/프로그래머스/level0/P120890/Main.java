package 프로그래머스.level0.P120890;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    int array[] = new int[]{3, 10, 28};
        System.out.println(new Solution().solution(array, 12));
    }
}

/**
 * 좋지못한 풀이다.
 * int배열 형태를 Integer List로 변환 해주고
 * 매겨변수로 들어온 n을 list에 넣어줬다
 * sort를 통해 정렬해줬고
 * 3가지의 경우로 나눴다
 * 1. n값이 list의 max값일경우 이미 sort를 진행했기떄문에 n값이 max일 경우에는
 * n 의 index +1 값이 존재하지않는다 무조건 n의 index -1값이 answer
 * 2. n값이 list의 min값을 경우 위의 경우와 index값만 반대이다.
 * 3. 좌 우 index 값이 다 존재하는경우 n과 좌 우 index의 수의 차가 작은 수가 answer가 된다
 * 만약 차가 같다면 좌우 숫자중 더 작은수를 return한다
 *
 */

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        List<Integer> intList
                = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        intList.add(n);
        Collections.sort(intList);

        if (n == Collections.max(intList)) {
            answer = intList.get(intList.size() - 2);
        } else if (n == Collections.min(intList)) {
            answer = intList.get(1);
        } else{
            int index = intList.indexOf(n);
            int compareLeft = intList.get(index) - intList.get(index - 1) ;
            int compareRight = intList.get(index + 1) - intList.get(index);
            if (compareRight < compareLeft){
                answer = intList.get(index + 1);
            }else{
                answer = intList.get(index - 1);
            }
        }
        return answer;
    }
}
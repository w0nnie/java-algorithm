package 프로그래머스.level0.P120897;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(24));
    }
}

/**
 *  매겨변수로 주어진 N의 제곱근까지의 약수만 구하면 완전탐색으로 풀지않아도 된다.
 *  1은 모든 정수의 약수이기에 시작지점을 2로 주고 list에 1을 넣어준 상태로 시작.
 *  1과 짝을 이루는 자기 자신또한 먼저 넣어줌
 *  제곱근까지의 약수를 구해
 *  해당 약수로 매겨변수 N을 나눴을때의 값이 자기 자신이 아니라면 list에 추가해줬다
 *  자시 자신인 경우는 이러하다 25의 약수 5 는 25 / 5 == 5  나눈수와 몫이 동일하기 때문에
 *  중복으로 들어가는 경우를 제외하기위해서 자기 자신이 아니라는 조건을 추가해줬다.
 * return 타입인 int[]형태로 파싱해주고 return
 */
class Solution {
    public int[] solution(int n) {
        int sqrt = (int) Math.sqrt((double) n);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(n);
        int i = 2;
        while (i <= sqrt) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n/i);
                }
            }
            i++;
        }
        Collections.sort(list);
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}
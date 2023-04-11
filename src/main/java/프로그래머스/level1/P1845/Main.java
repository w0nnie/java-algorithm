package 프로그래머스.level1.P1845;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        System.out.println(new Solution().solution(nums));
    }
}

/**
 * hash로 분류되어있는 문제다. 하지만 사용하지않고 풀이했다
 * 문제속에 담이있는데 포켓몬은 최대 nums의 길이 /2 만큼 선택가능하다
 * 선택가능한 숫자중 가장 많은 종을 다양하게 선택하는게 답이 됨
 * num.length/2 가 종의 수 (중복제거) 보다 크면 종의 수만큼 선택
 * 반대면 num.length/2를 출력하면된다.
 */

class Solution {
    public int solution(int[] nums) {
        int pokemonCount = nums.length / 2;
        int temp = (int) Arrays.stream(nums).boxed().distinct().count();
        int answer = pokemonCount >= temp ? temp : pokemonCount;
        return answer;
    }
}



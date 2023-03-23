package 프로그래머스.level0.P120904;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(123456,7));
    }
}
/**
 * list를 하나만들어주고
 * 매겨변수로 들어온 num값을 String -> char를 통해 list에 int형태로 add해줬다
 * list의 indexOf 메서드를 사용하면 매개변수를 통해 해당 매개변수가 몇번째 인덱스에 있는지
 * return 해준다 또한 값이 없을경우 -1을 뱉어준다
 * 문제에서는 list 자료구조의 index 구조랑 다르게 첫번째 자리가 1로 셈이 매겨지기떄문에
 * 삼항연산자를 사용하여 값이없을경우를 제외하고는(-1일떄) +1을 해줘 문제가 원하는 식으로 index값을
 * 맞춰줬다.
 */
class Solution {
    public int solution(int num, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            char a = String.valueOf(num).charAt(i);
            list.add((int) a -'0');
        }
        int answer = list.indexOf(k) != - 1 ?  list.indexOf(k) + 1 : list.indexOf(k);
        return answer;
    }
}
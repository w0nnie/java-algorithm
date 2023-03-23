package 프로그래머스.level0.P120904;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution2().solution(123456,6));
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

/**
 * 리팩토링
 * String에서도 valueOf 메서드를 사용가능했다
 * 굳이 List까지 만들어서 메모리에 할당하고 for문을 돌려 스택메모리까지 사용할필요도 없었다
 */
class Solution2 {
    public int solution(int num, int k) {
        return String.valueOf(num).indexOf(String.valueOf(k)) != -1 ? String.valueOf(num).indexOf(String.valueOf(k))  + 1: String.valueOf(num).indexOf(String.valueOf(k)) ;
    }
}

/**
 * 다른사람풀이 그저 감탄했다
 * 1부터 카운트 해주기위해 아무관련없이 한글자인 string붙여서 indexOf를 바로 먹였다..
 */
class Solution3 {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
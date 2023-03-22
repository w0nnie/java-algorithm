package 프로그래머스.level0.P120891;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(29423));
    }
}

/**
 * list 컬렉션을 만들고
 * 매개변수로 들어온 order를 string으로 변환후 charAt.(index)로 짜른 후 다시 int로 캐스팅 하여 넣어줬는데
 * ascii 값으로 들어온다 그럴땐 -'0'을 해준다.
 * 그럼 내가 원하는 order가 쪼개진 정수형태로 들어온다
 * stream을 써보려 했지만 역시나 어렵다
 * return 해줄 answer 에  filter조건을 걸어 3, 6, 9 에 해당하는 값들의 count를 int형으로 캐스팅해 담아줬다
 */
class Solution {
    public int solution(int order) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < String.valueOf(order).length(); i++) {
            list.add((int) String.valueOf(order).charAt(i) - '0');
        }
        int answer = (int) list.stream().filter(x -> x == 3 || x == 6 || x == 9).count();
        return answer;
    }
}
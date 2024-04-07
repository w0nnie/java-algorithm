package 프로그래머스.level2.P42842;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(8,1));
    }
}

/**
 * @Description
 *
 * brownRule = 가로 * 2  + (세로 - 2 ) * 2
 * -> 브라운은 테두리라는 것에 집중해야한다.
 * 직사각형의 경우 가로가 두변이기에 *2를 해주고
 * 세로 또한 2변이기에 * 2를 해주지만 그전에 가로와 맞닫는 꼭짓점을 빼준다 (-2)
 *  가로 + 세로
 *
 * yellowRule = (가로 -2) * (세로 -2) 
 * -> 옐로우는 면적을 구해야 하는것에 집중해야한다.
 * 1줄로 이루어진 테두리가 양변에 있기에 가로, 세로 모두 -2를 해주고
 * 가로 * 세로
 */
class Solution {
    public int[] solution(int brown, int yellow) {
        int hap = brown + yellow;
        List<Integer> yaksuList = new ArrayList<>();
        for (int i = 1; i <= hap; i++) {
            if (hap % i == 0) {
                yaksuList.add(i);
            }
        }

        int[] answer = new int[2];
        for (int i = 0; i < yaksuList.size(); i++) {
            for (int j = 0; j < yaksuList.size(); j++) {
                int brownRule = (yaksuList.get(i) * 2) + ((yaksuList.get(j) - 2) * 2);
                int yellowRule = (yaksuList.get(i) - 2) * (yaksuList.get(j) - 2);
                if (brownRule == brown && yellowRule == yellow) {
                    answer[0] = yaksuList.get(i);
                    answer[1] = yaksuList.get(j);
                    break;
                }
            }
        }
        return answer;
    }
}

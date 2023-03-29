package 프로그래머스.level0.P120887;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1,13,1));
    }
}

/**
 * 반복문을 매겨변수로 들어온 i ~ j 까지 반복한다
 * index에 걸리는 숫자가 자리가 다양하기떄문에 해당 숫자의 자리수 만큼 for문을반복한다
 * char 형태로 해당 숫자를 짜르고 (한자리씩) 매겨변수로 들어온 k와 값을 비교해 같다면
 * answer 1씩 증가시켜준 후 return
 */
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i ; l <= j; l++) {
            for (int m = 0; m < String.valueOf(l).length(); m++) {
                char a = String.valueOf(l).charAt(m);
                if (a -'0' == k) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
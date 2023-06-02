package 프로그래머스.level2.P12911;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(78));
    }
}

//조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.

/**
 * 시간초과가 났는데 찾아보니 Integer 래퍼클래스의 bitCount라는 메서드가있더라
 */
class Solution {
    public int solution(int n) {
        int oneCount = binaryString(n);
        int answer = n + 1;
        while (true) {

            if (binaryString(answer) == oneCount) {
                break;
            }
            answer++;
        }
        return answer;
    }

    private int binaryString(int n) {

        return (int) Arrays.stream(Integer.toBinaryString(n).split("")).filter(i -> Integer.parseInt(i) == 1).count();
    }
}



//class Solution {
//    public int solution(int n) {
//        int oneCount = binaryString(n);
//        int answer = n + 1;
//        while (true) {
//
//            if (binaryString(answer) == oneCount) {
//                break;
//            }
//            answer++;
//        }
//        return answer;
//    }
//
//    private int binaryString(int n) {
//
//        return Integer.bitCount(n);
//    }
//}


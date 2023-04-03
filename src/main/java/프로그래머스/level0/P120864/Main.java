package 프로그래머스.level0.P120864;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("aAb1B2cC34oOp"));
    }
}

/**
 * 정규표현식을 이용했다
 * 매개변수 my_String을 알파벳으로 split하여 숫자만 남긴 채로 ms배열에 넣어준다
 * ms배열의 index를 다돌면서 비어있다면 0을 값이있다면 int형으로 파싱후 answer에 더해줘 return 해줬다.
 */

class Solution {
    public int solution(String my_string) {
        String[] ms = my_string.split("[a-zA-Z]");
        int answer = 0;
        for (int i = 0; i < ms.length; i++) {
            answer += ms[i].isEmpty() ? 0 : Integer.parseInt(ms[i]);
        }
        return answer;
    }
}


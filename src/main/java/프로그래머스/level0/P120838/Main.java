package 프로그래머스.level0.P120838;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(".--. -.-- - .... --- -."));
    }
}

/**
 * 키와 밸류형태로 이루어져있기때문에
 * map 자료구조를 이용했다.
 * 간단하게 moser라는 Map 컬력션에 값들을 다 넣어준후
 * 매겨변수로 넘어온 letter를 " " 구분자로 split해준후 배열에 담아줬다
 * 배열의 길이만큼 반복문을 통해 인덱싱한 key값을 들고 morse로 들어가 value값을 꺼내와 answer에 붙여
 * return 해줬다.
 */
class Solution {
    public String solution(String letter) {
        Map<String, String> morse = new HashMap<>() {
            {
                put(".-","a");
                put("-...","b");
                put("-.-.","c");
                put("-..","d");
                put(".","e");
                put("..-.","f");
                put("--.","g");
                put("....","h");
                put("..","i");
                put(".---","j");
                put("-.-","k");
                put(".-..","l");
                put("--","m");
                put("-.","n");
                put("---","o");
                put(".--.","p");
                put("--.-","q");
                put(".-.","r");
                put("...","s");
                put("-","t");
                put("..-","u");
                put("...-","v");
                put(".--","w");
                put("-..-","x");
                put("-.--","y");
                put("--..","z");
            }
        };
        String a[] = letter.split(" ");

        String answer = "";
        for (int i = 0; i < a.length; i++) {
            answer +=morse.get(a[i]);
        }
        return answer;
    }
}
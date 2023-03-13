import java.io.*;
import java.util.*;

/**
 * 슈도코드
 * 예제 입력
 * uppercase로 다 대문자 형태 변환
 * char로 쪼개서 해당 인덱스 + 1
 * max값 중복체크
 * 중복시 ?
 * 미중복시 max번쨰 인덱스 출력
 */

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String userInput = sc.next().toUpperCase();

    private static int[] count = new int[26];

    private static int max;

    public static void main(String[] args) {
        for (int i = 0; i < userInput.length() ; i++) {
            int word = userInput.charAt(i) - 'A';
            count[word] ++;
        }
        System.out.println(maxAndDuplicate());
    }

    private static char maxAndDuplicate() {
        max = 0;
        char ans = '0';
        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                ans = (char) (i + 'A');
            }else if(max == count[i]){
                ans = '?';
            }
        }
        return ans;
    }
}

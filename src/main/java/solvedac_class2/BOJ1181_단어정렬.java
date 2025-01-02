package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ1181_단어정렬 {

    /**
     * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
     * <p>
     * 길이가 짧은 것부터
     * 길이가 같으면 사전 순으로
     * 단, 중복된 단어는 하나만 남기고 제거해야 한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {

            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length(); //양수의 경우 위치변경
                }
            }
        });

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}

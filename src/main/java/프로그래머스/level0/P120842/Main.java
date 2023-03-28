package 프로그래머스.level0.P120842;

public class Main {
    public static void main(String[] args) {
    int num_list[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(new Solution().solution(num_list, 2));
    }
}

/**
 * 전형적인 2차원배열 형태의 문제이다
 * 매겨변수로 들어온 n의 경우가 열로 들어가고 num_list / n 이 행으로 들어간 형태의
 * 2차원배열을 만들어주고
 * num_list의 index를 담당할 인트형 변수를 하나 만들어준다
 * 밖에 for문은 행을 담당하기에 numList.length/ n 만큼 ++ 해주고
 * 안에 for문은 매겨변수로 들어온 n만큼만 ++해준다
 * 실질적으로 값이 들어갈값은 numlist의 index안에 값이기때문에
 * 안에 for문에서 index++도 해주었다.
 *
 */

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;
        for (int i = 0; i < num_list.length / n; i++) { //0~3 4
            for (int j = 0; j < n; j++, index++) { //0,1 2
                answer[i][j] = num_list[index];
            }
        }
        return answer;
    }
}
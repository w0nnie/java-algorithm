package 프로그래머스.level0.P120816;

public class Main {
    public static void main(String[] args) {
        int[] dot = {2, 4};
        System.out.println(new Solution().solution(7,10));
    }
}

class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        while (slice < n) {
            answer++;
            if (slice * answer >= n) {
                break;
            }
        }
        return answer;
    }
}

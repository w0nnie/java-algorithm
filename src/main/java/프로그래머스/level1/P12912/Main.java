package 프로그래머스.level1.P12912;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(626331));
    }
}


class Solution {
    static int answer = 0;
    public int solution(long num) {
        while (num != 1) {
            if (answer == 500) {
                return -1;
            }else{
                if (num % 2 == 0) {
                    num /= 2;
                }else{
                    num = num * 3 + 1;
                }
                answer++;
            }
        }
        return answer; // count
    }
}



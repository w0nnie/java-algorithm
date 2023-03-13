package 프로그래머스.level0.P120814;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(15));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 7 == 0){
            answer = n / 7;
        }else{
            answer = n / 7 + 1;
        }
        return answer;
    }
}
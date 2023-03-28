class Solution {
    public int solution(int n) {
        int answer = 1;
        int tmep = 1;
        while (true) {
            if (tmep == n) {
                return answer;
            } else if (tmep > n) {
                return answer - 1;
            }
            answer += 1;
            tmep *= answer;
        }
    }
}
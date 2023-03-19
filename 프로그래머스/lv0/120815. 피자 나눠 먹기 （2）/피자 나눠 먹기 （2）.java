class Solution {
    public int solution(int n) {
        int answer = 1;
        int pizza = 6;
        while (true) {
            if ((answer * pizza) % n == 0) {
                break;
            }
            answer += 1;
        }

        return answer;
    }
}
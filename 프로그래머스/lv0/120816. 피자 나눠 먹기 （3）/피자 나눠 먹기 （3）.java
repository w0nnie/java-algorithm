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

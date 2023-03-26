class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int sqrt = (int) Math.sqrt(i);
            int temp = 0;
            int x = 1;
            while (x <= sqrt) {
                if (i % x == 0) {
                    temp++;
                    if (i / x != x) {
                        temp++;
                    }
                }
                x++;
            }
            if (temp >= 3) {
                answer++;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i ; l <= j; l++) {
            for (int m = 0; m < String.valueOf(l).length(); m++) {
                char a = String.valueOf(l).charAt(m);
                if (a -'0' == k) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
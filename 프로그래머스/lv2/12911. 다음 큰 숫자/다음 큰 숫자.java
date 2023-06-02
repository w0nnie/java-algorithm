class Solution {
    public int solution(int n) {
        int oneCount = binaryString(n);
        int answer = n + 1;
        while (true) {

            if (binaryString(answer) == oneCount) {
                break;
            }
            answer++;
        }
        return answer;
    }

    private int binaryString(int n) {

        return Integer.bitCount(n);
    }
}
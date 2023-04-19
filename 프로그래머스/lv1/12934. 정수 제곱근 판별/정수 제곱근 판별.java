class Solution {
    public long solution(long n) {
        long answer = (long) Math.sqrt(n) * (long) Math.sqrt(n) != n ? -1 : ((long) Math.sqrt(n) + 1) * ((long) Math.sqrt(n) + 1);
        return answer;
    }
}
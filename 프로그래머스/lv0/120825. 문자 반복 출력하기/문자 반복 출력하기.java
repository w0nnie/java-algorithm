class Solution {
    public String solution(String my_string, int n) {
        String[] split = my_string.split("");
        String answer = "";
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < n; j++) {
                answer += split[i];
            }
        }
        return answer;
    }
}
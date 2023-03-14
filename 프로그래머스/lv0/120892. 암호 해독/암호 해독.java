class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code; i < cipher.length() + 1; i++) {
            if(i % code == 0){
                answer += cipher.charAt(i-1);
            }
        }
        return answer;
    }
}
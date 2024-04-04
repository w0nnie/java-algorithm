class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            char making = '*';
            if (phone_number.length() - i <= 4) {
                making = phone_number.charAt(i);
            }
            answer += making;
        }
        return answer;
    }
}
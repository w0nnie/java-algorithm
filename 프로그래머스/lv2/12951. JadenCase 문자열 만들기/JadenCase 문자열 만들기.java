class Solution {
    public String solution(String s) {
        String answer = "";
        char end = s.charAt(s.length() - 1);
        String[] temp = s.split(" ");
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length(); j++) {
                char a = temp[i].charAt(j);
                if (j == 0) {
                    answer += String.valueOf(a).toUpperCase();
                }else{
                    answer += String.valueOf(a).toLowerCase();
                }
            }
            answer += " ";
        }
        if (end == ' ') {
            return answer;
        }
        return answer.trim();
    }
}
class Solution {
    public int solution(String my_string) {
        String[] ms = my_string.split("[a-zA-Z]");
        int answer = 0;
        for (int i = 0; i < ms.length; i++) {
            answer += ms[i].isEmpty() ? 0 : Integer.parseInt(ms[i]);
        }
        return answer;
    }
}

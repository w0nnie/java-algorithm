import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int pickNum = commands[i][2];
            int[] sortArr = new int[end - start + 1];
            int index = 0;
            for (int j = start - 1; j < end; j++) {
                sortArr[index++] = array[j];
            }
            Arrays.sort(sortArr);
            answer[i] = sortArr[pickNum - 1];
        }
        return answer;
    }
}

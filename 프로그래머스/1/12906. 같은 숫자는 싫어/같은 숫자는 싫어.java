import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; // arr의 i번째 인덱스 원소
            if (i == 0) {
                stack.push(num);
            }else{
                int ex = (int) stack.peek();
                if (num != ex) {
                    stack.push(num);
                }
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
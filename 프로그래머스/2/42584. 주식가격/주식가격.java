import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[prices.length];
        for (int i = prices.length - 1; i >= 0; i--) {
            stack.push(prices[i]);
        }

        int index = 0;
        while(!stack.isEmpty()) {
            int num = stack.get(stack.size() - 1);
            int second = 0;

            for (int i = stack.size() - 2; i >= 0; i--) {
                second++;
                if(num > stack.get(i))break;
            }
            answer[index++] = second;
            stack.pop();
        }
        return answer;
    }
}
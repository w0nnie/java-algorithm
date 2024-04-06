package 프로그래머스.level1.P12906;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        System.out.println(new Solution().solution(arr));
    }
}



class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (queue.peek() != arr[i]) {
                queue.add(arr[i]);
            }
        }

        int[] answer = new int[queue.size()];
        for (int i = 0; i < queue.size(); i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }
}


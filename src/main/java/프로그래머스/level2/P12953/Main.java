package 프로그래머스.level2.P12953;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        System.out.println(new Solution().solution(arr));
    }
}


class Solution {
    public int solution(int[] arr) {
        int answer;
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i] = arr[i] * arr[j] / getGCD(arr[i], arr[j]);
            }
        }

        answer = arr[0];
        return answer;
    }

    public int getGCD(int x, int y) {
        if(y == 0 ) return x;
        return getGCD(y, x % y);
    }
}

package 프로그래머스.level0.P120819;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(5500));
    }
}

class Solution {
    public int[] solution(int money) {
        final int COFFEEPRICE = 5500;
        int[] answer = {money / COFFEEPRICE, money % COFFEEPRICE};
        return answer;
    }
}
class Solution {
    public int[] solution(int money) {
        final int COFFEEPRICE = 5500;
        int[] answer = {money/ COFFEEPRICE, money%COFFEEPRICE};
        return answer;
    }
}
class Solution {
    public boolean solution(int x) {
        String[] temp = String.valueOf(x).split("");
        int divide = 0;
        for (int i = 0; i < temp.length; i++) {
            divide += Integer.parseInt(temp[i]);
        }
        return x % divide == 0 ? true : false;
    }
}

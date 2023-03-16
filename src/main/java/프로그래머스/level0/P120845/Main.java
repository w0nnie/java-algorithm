package 프로그래머스.level0.P120845;
public class Main {
    public static void main(String[] args) {
        int[] box = new int[]{10, 8, 6,};
        System.out.println(new Solution().solution(box, 3));
    }
}

class Solution {
    public int solution(int[] box, int n) {
        int width = box[0] / n;
        int length = box[1] / n;
        int height = box[2] / n;
        int answer = width * length * height;
        return answer;
    }
}

package 프로그래머스;

/**
 * 숙련도 최솟값을 구하는것
 */
public class P340212 {

    public static void main(String[] args) {
        /**
         * 숙련도가 2인경우
         * 첫번째 level(2) - diffs(1) >= 0 -> times(2)
         * 두번째 level(2) - diffs(5) < 0 -> (4 + 2) * 3 + 4 -> 22
         * 세번째 level(2) - diffs(3) < 0 -> (7 + 4) * 1 + 7 -> 18
         */


        int[] diffs = {1, 99999, 100000, 99995};
        int[] times = {9999, 9001, 9999, 9001};
        long limit = 3456789012L;

    }
    class Solution {
        public int solution(int[] diffs, int[] times, long limit) {
            int answer = 0;
            int level = 0;
            while (true) {
                long hap = 0;
                level++;
                for (int i = 0; i < diffs.length; i++) {

                    //반복하지않아도 되는경우
                    if (level - diffs[i] >= 0) {
                        hap += times[i];
                    } else {
                        long repeatCount = Math.abs(diffs[i] - level);
                        hap += (times[i - 1] + times[i]) * repeatCount + times[i];
                    }
                }

                if (hap <= limit) {
                    answer = level;
                    break;
                }
            }
            return answer;
        }
    }
}

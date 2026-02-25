import java.util.Arrays;

class Solution {
        public long solution(int n, int[] times) {
            Arrays.sort(times);
            long min = 1L;
            long max = (long) times[times.length - 1] * n;
            long answer = 0;
            while (min <= max) {
                long mid = (min + max) / 2;
                long count = 0;
                for (int i = 0; i < times.length; i++) {
                    count += mid / times[i];
                }
                if (count < n) {
                    min = mid + 1;
                } else {
                    answer = mid;
                    max = mid - 1;;
                }
            }
            return answer;
        }
    }
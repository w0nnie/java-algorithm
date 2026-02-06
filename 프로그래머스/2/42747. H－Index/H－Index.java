import java.util.Arrays;

class Solution {
        public int solution(int[] citations) {
            int answer = 0;
            Arrays.sort(citations);

            int n = citations.length;
            for (int i = 0; i < n; i++) {
                int h = n - i;
                int count = 0;

                for (int j = 0; j < n; j++) {
                    if(h <=citations[j]) {
                        count++;
                    }
                }

                if (count >= h) {
                    answer =  h;
                    break;
                }
            }
            return answer;
        }
    }
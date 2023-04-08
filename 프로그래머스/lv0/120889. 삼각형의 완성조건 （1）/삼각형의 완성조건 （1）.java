import java.util.Arrays;

class Solution {
        public int solution(int[] sides) {
            Arrays.sort(sides);
            int temp = 0;
            for (int i = 0; i < sides.length; i++) {
                if (i != sides.length-1) {
                    temp += sides[i];
                }else{
                    if (temp <= sides[i]) {
                        return 2;
                    }
                }

            }
            return 1;
        }
    }
package 프로그래머스.level1.P76501;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] absolutes = {10,22,3};
        boolean[] signs = {false,false,true};
        System.out.println(new Solution().solution(absolutes,signs));
    }
}
//        List<Integer> av = IntStream.of(absolutes).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        return Arrays.stream(absolutes).map(i -> signs[av.indexOf(i)] == false ? i * -1 : i).sum();

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int ans = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                ans += absolutes[i];
            }else{
                ans -= absolutes[i];
            }
        }
        return ans;
    }
}


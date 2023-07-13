import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        List<Integer> av = IntStream.of(absolutes).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        return Arrays.stream(absolutes).map(i -> signs[av.indexOf(i)] == false ? i * -1 : i).sum();
    }
}
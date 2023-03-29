import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        List<Integer> intList
                = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        intList.add(n);
        Collections.sort(intList);
        System.out.println(intList.toString());

        if (n == Collections.max(intList)) {
            answer = intList.get(intList.size() - 2);
        } else if (n == Collections.min(intList)) {
            answer = intList.get(1);
        } else{
            int index = intList.indexOf(n);
            int compareLeft = intList.get(index) - intList.get(index - 1) ;
            int compareRight = intList.get(index + 1) - intList.get(index);
            if (compareRight < compareLeft){
                answer = intList.get(index + 1);
            }else{
                answer = intList.get(index - 1);
            }
        }
        return answer;
    }
}
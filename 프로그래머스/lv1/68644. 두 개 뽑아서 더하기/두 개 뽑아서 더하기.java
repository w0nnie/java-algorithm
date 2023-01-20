import java.util.*;
import java.util.stream.Collectors;

/**
 * 슈도코드
 * inputNum [] 생성
 * 2중 포문 index접근하여
 * 모든 경의의수 answerList에 add
 * 중복 제거 , sort 후 출력
 */
public class 두개_뽑아서_더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] inputNum = new int[] {2,1,3,4,1};
        System.out.println(solution.solution(inputNum));
    }
}


class Solution {
    public List<Integer> solution(int[] inputNum) {
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < inputNum.length ; i++) {
            for (int j = i+1; j <inputNum.length ; j++) {
                tempList.add(inputNum[i] + inputNum[j]);
            }
        }
        return deduplication(tempList);
    }

    /**
     * 중복제거
     * 람다 distinct 사용하여 중복제거, stream 객체로 반환받지 않기위해 list로 파싱
     * @param tempList
     * @return
     */
    public List<Integer> deduplication(List<Integer> tempList){
        List<Integer> answerList =  tempList.stream().distinct().collect(Collectors.toList());
        return sortList(answerList);
    }

    /**
     * 정렬
     * @param answerList
     * @return
     */
    public List<Integer> sortList(List<Integer> answerList){
        Collections.sort(answerList);
        return answerList;
    }
}
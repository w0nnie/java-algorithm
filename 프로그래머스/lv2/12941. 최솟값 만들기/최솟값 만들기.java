import java.util.Arrays;

class Solution
{
    public int solution(int[] A, int[] B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        int[] sortB = new int[B.length];
        
        for (int i = 0; i < sortB.length; i++) { //B 내림차순 정렬
            sortB[i] = B[B.length - i - 1];
        }


        // 내림차순으로 sort하기 위해서는 wrapper클래스 타입이여하 한다.
        // 효율성 문제 떨어짐
//        Integer[] reverseSortB = Arrays.stream(B).boxed().toArray(Integer[]::new);
//        Arrays.sort(reverseSortB, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * sortB[i];
        }

        return answer;
    }
}
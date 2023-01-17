import java.util.*;

public class Main {
    private static List<Integer> inputList;
    private static int resultAvg;
    private static int resultMid;
    private static List<Integer> answerList = new ArrayList<>();

    public static void main(String[] args) {
        inputList = userInput();
        listSort(inputList);
        answerList.add(resultAvg = getAvg(inputList));
        answerList.add(resultMid = getMid(inputList));
        print(answerList);
    }

    /**
     * 처음 써보는 람다.. 이게 맞을까..?
     * @param answerList
     */
    private static void print(List<Integer> answerList) {
        answerList.stream().forEach(answer -> System.out.println(answer));
    }

    /**
     * userInput
     * @return
     */
    private static List<Integer> userInput() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int inputNum = sc.nextInt();
            listAdd(list, inputNum);
        }
        return list;
    }

    /**
     * list 추가
     * @param list
     * @param inputNum
     */
    private static void listAdd(List<Integer> list, int inputNum) {
        list.add(inputNum);
    }

    /**
     * List 정렬
     * @param list
     * @return
     */
    public static List<Integer> listSort(List<Integer> list){
        Collections.sort(list);
        return list;
    }

    /**
     * list 평균
     * @param inputList
     * @return
     */
    private static Integer getAvg(List<Integer> inputList) {
        int sumNum = 0;
        for (int i = 0; i <inputList.size() ; i++) {
            sumNum += inputList.get(i);
        }
        sumNum /= inputList.size();
        return sumNum;
    }

    /**
     * list의 중간값 찾기
     * @param inputList
     * @return
     */
    private static Integer getMid(List<Integer> inputList){
        resultMid = inputList.get(inputList.size() / 2);

        return resultMid;
    }
}

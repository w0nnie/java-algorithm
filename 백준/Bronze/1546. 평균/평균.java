import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main bj = new Main();
        Scanner sc = new Scanner(System.in);

        int subjectCount = sc.nextInt();

        //과목개수 범위
        while(!bj.subjectRangeCheck(subjectCount)){
            subjectCount = sc.nextInt();
        }

        // https://deftkang.tistory.com/55
        sc.nextLine();

        //N개의 수만큼 성적이 주어졌는지, 100보다 작거나 같은 음이 아닌 정수 적어도 하나의 값은 0보다 크다 즉 셋다 0점일순 없다
        String scores = sc.nextLine();
        while((subjectCount != bj.isScoreCount(scores)) || !bj.isScoreRull(scores)){
            scores = sc.nextLine();
        }
        StringTokenizer st = new StringTokenizer(scores);
        List<Integer> scoreList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            scoreList.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(bj.mainLogic(scoreList, bj.findSubjectMaxScore(scoreList)));

    }

    /**
     * 시험 본 과목의 개수(N) <=1000 체크
     *
     * @param N
     * @return
     */
    public boolean subjectRangeCheck(int N) {
        if (N <= 1000) return true;
        return false;
    }

    /**
     * N개의 수만큼 성적이 주어졌는지,
     *
     * @param scores
     * @return
     */
    public int isScoreCount(String scores) {
        StringTokenizer st = new StringTokenizer(scores);
        List<Integer> scoreList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            scoreList.add(Integer.parseInt(st.nextToken()));
        }
        return scoreList.size();
    }

    /**
     * 100보다 작거나 같은 음이 아닌 정수 적어도 하나의 값은 0보다 크다 즉 셋다 0점일순 없다
     *
     * @param scores
     * @return
     */
    public boolean isScoreRull(String scores) {
        StringTokenizer st = new StringTokenizer(scores);
        List<Integer> scoreList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            scoreList.add(Integer.parseInt(st.nextToken()));
        }
        int flag = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            int temp = scoreList.get(i);
            if (temp > 100 || temp < 0) return false;
            if (temp == 0) flag += 1;
            if (flag == scoreList.size()) return false;
        }

        return true;
    }

    /**
     * 과목의 수만큼 입력된 점수중 최고점(M)을 잘 찾는지
     *
     * @param scoreList
     * @return
     */
    public int findSubjectMaxScore(List<Integer> scoreList) {

        return scoreList.stream().reduce(0, Integer::max);
    }

    /**
     * 점수/M * 100 로직 테스트
     *
     * @param scoreList
     * @return
     */
    public double mainLogic(List<Integer> scoreList, int maxScore) {
        double afterLogicScore = 0;
        List<Double> ansList = new ArrayList<>();
        for (int i = 0; i < scoreList.size(); i++) {
            afterLogicScore = (double) scoreList.get(i) / maxScore * 100;
            ansList.add(afterLogicScore);
        }

        return ansList.stream().reduce(0.0, Double::sum) / scoreList.size();
    }
}

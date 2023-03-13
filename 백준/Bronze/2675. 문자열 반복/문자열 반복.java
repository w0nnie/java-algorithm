import java.io.*;
import java.util.*;

public class Main {

    /**
     * #슈도코드
     * 버퍼리더 생성
     * 입력리스트 생성
     * 출력 리스트 생성
     * tc cnt 입력
     * cnt만큼 R S 입력
     * 입력리스트에 S를 각각 append
     * 출력리스트 (입력리스트.get(index) * S ) append
     * print(출력리스트.char(i)
     */
    private static int testCaseCount;
    private static int R;
    private static String S;
    private static List<String> outputList = new ArrayList<>();
    private static Iterator<String> answer;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    //ide가 코딩을 하는걸까 내가 코딩을 하는걸까
    static {
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws IOException {
        testCaseCount = getCount();
        calc();
    }

    /**
     * 입력받은 line을 st로 쪼개고 string -> Integer로 파싱해주는 메서드
     * @return
     */
    private static int getCount() {
        return Integer.parseInt(st.nextToken());
    }

    /**
     * 계산 메서드
     * @throws IOException
     */
    private static void calc() throws IOException {
        for (int i = 0; i < testCaseCount ; i++) {
            outputList = new ArrayList<>();
            userInput();
            calc2();
            print();
        }
    }

    /**
     * testCaseCount 만큼 br.readLine을 하고 st로 쪼개서 R, S를 입력받음
     * @throws IOException
     */
    private static void userInput() throws IOException {
        st = new StringTokenizer(br.readLine());
        R = getCount();
        S = st.nextToken();
    }

    /**
     *S의 length 만큼 cloning
     */
    private static void calc2() {
        for (int j = 0; j <S.length() ; j++) {
            cloning(j);
        }
    }

    /**
     * S.get(j)의 char값을 string으로 파싱하고 R번 반복하여 outputList에 add해줌
     * @param j
     */
    private static void cloning(int j) {
        for (int k = 1; k <= R; k++) {
            outputList.add(String.valueOf(S.charAt(j)));
        }
    }

    /**
     * //Iterator를 한번 사용해보자
     * print
     */
    private static void print() {
        answer = outputList.listIterator();
        while(answer.hasNext()){
            System.out.print(answer.next());
        }
        System.out.println();
    }
}

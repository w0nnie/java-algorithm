import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(st.nextToken()); // 데이터의 개수
        int quNo = Integer.parseInt(st.nextToken()); // 퀴즈 개수
        int[] sumArr = new int[suNo + 1]; //구간합배열 1번인덱스 부터
        
        sumArrAdd(br, suNo, sumArr);
        solution(br, quNo, sumArr);
    }

    /**
     * start, end 값 입력과 동시에  
     * sumArr배열에 구간합 공식을 적용하여 원하는값을 도출
     * @param br
     * @param quNo
     * @param sumArr
     * @throws IOException
     */
    private static void solution(BufferedReader br, int quNo, int[] sumArr) throws IOException {
        StringTokenizer st;
        for(int q = 0; q< quNo; q++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[end] - sumArr[start-1]);
        }
    }

    /**
     * sumArr 누적
     * @param br
     * @param suNo
     * @param sumArr
     * @throws IOException
     */
    private static void sumArrAdd(BufferedReader br, int suNo, int[] sumArr) throws IOException {
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<= suNo; i++){
            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
        }
    }
}

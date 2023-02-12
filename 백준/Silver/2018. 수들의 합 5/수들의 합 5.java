import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 슈도코드
     * N, 시작인덱스, 종료인덱스  ans = 1(N이 15일떄 숫자 15만 뽑는경우를 미리 넣고 초기화)
     * sum = 시작인덱스 ~  종료인덱스 까지의 합
     * sum > N : sum - 시작인덱스, 시작인덱스 ++
     * sum < N : 종료인덱스 ++ sum + 종료인데스
     * sum == N : count ++ 종료인덱스 ++ sum + 종료인데스
     *
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int start,end,sum,ans;
        start = 1;
        end = 1;
        sum = 1;
        ans = 1;
        while (end != N) {
            if (sum == N) {
                ans++;
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start ++;
            } else {
                end++;
                sum += end;
            }
        }
        System.out.println(ans);
    }
}
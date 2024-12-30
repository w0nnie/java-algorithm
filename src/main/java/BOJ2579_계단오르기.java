import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2579_계단오르기 {

    static int answer = 0;
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 마지막 계단은 무조건 밟아야 하므로 초기화
        getMax(0, 0, 0); // max, 연속 계단 수, 시작 인덱스
        System.out.println(answer);
    }

    private static void getMax(int max, int stair, int index) {
        // 종료 조건: 마지막 계단에 도달했을 때
        if (index == N - 1) {
            max += arr[index]; // 마지막 계단 밟기
            if (max > answer) {
                answer = max;
            }
            return;
        }

        // 종료 조건: 계단을 넘어섰을 때
        if (index >= N) {
            return;
        }

        // 계단을 연속해서 1칸 밟는 경우
        if (stair < 2) {
            getMax(max + arr[index], stair + 1, index + 1);
        }

        // 계단을 2칸 뛰어넘는 경우
        getMax(max + arr[index], 1, index + 2);
    }
}

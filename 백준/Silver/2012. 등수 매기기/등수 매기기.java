import java.io.*;
import java.util.Arrays;

/**
 * 문제분류가 그리디, 정렬인걸확인 후
 * I/O static 으로 선언해주고
 * 입력받을 int arr
 * 1등부터 N등 까지의 등수를 담아줄 sorted int 배열이 껍데기를 선언해줌
 * n을 입력받아주고
 * arr, sorted를 init해줍니다 배열의크기는 당연히 학생들의 수인 N입니다.
 * 문제에서 제시했듯이 학생들의 예상 석차를 입력받습니다 반복문을통해서
 * arr, sorted index에 접근하기 위해서 0 ~ n-1
 * sorted 배열은 1~N 의 정보를 담아야하니 i + 1 로 지정
 * 듀얼피봇 퀵정렬(Dual-Pivot QuickSort) 알고리즘을 사용하는 Arrays class의 sort메서드를 사용해서 정렬함
 *
 * 듀얼피봇 퀵정렬 (inserting sort(삽입정렬) + quick sort(퀵정렬)) 아직 퀵정렬을 이해하는중
 *
 * 정렬 후 메인 로직 진입
 * 출력값인 ans 변수를 long으로 만들어주고
 * 왜 long?
 * 문제에서 N의 범위가 500,000 인데, 만약 모든 학생이 자신의 등수를 1로 예상할경우,
 * |1-500,000| x 500,500 이 되어서 int의 범위를 벗어난다.
 * |arr[index] - sorted[index]| 를 ans에 더해주고 출력해준다.
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;
    static int[] sorted;
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = i + 1;
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        sumBulmando();
    }

    private static void sumBulmando() throws IOException {
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.abs(arr[i] - sorted[i]);
        }
        System.out.println(ans);

//        bw.flush();
//        br.close();
//        bw.close();
    }
}

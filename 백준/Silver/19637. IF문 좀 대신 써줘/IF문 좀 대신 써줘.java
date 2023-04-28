import java.io.*;
import java.util.StringTokenizer;

/**
 * I/O static 구현
 * chingo arr, 전투력[] 선언
 * StringTokenizer 통해서 잘라줍니다
 * split이 더 느린이유
 * split은 정규식을 기반으로 자르는 로직이기때문에 내부가 복잡하다고 합니다
 * 반면에 StringTokenizer의 nextToken 메서드는 단순히 공백 자리를 떙겨서 자르는거기때문에 속도차이가 남.
 * n == 칭호 갯수
 * m == 입력받을 전투력의 갯수
 * 칭호 갯수인 n을통해 두배열들을 init 해줍니다 크기는 n
 * 이제 n만큼 반복하여 각각의 배열의 칭호의 이름과 그 칭호의 전투력을 입력받아 index에 넣어줍니다
 * 여기서 중요한건 이분탐색을 사용하기위해서는 전투력이 정렬되어있어야한다 는 점인데
 * 해당 문제는 이미 정렬되어있기 떄문에 정렬안해줌
 *
 * m번만큼의 반복을 통해 전투력을 입력받고
 * 이분탐색을 진행해야하니 left값 right 값 을  선언 해줍니다
 * left값은 배열의 시작점인 0 right값은 배열의 끝 (크기 -1) 이 됩니다
 * right값과 left값이 동일할때 까지 반복, 역전이되면 종료하는 while문입니다
 * middle값은 ( left + right )/ 2
 * 전투력 arr 의 middle 인덱스 값보다 방금 입력받은 전투력값이 크냐 ? 를 물어보고
 * 전투력 배열의 middle 인덱스보다 입력받은 전투력이 더 크다면
 * left값을  조정을 해서 오른쪽 탐색을 반대면 right 을 조정해서 왼쪽탐색을 하게 만들어줍니다
  left와 right 값이 역전되는 순간 의 left 값을 통해서 전투력의 범위값을 알수있게됩니다
  해당 left값을 통해 칭호arr에 index값으로 접근해 bufferedWrite의 write메서드에 인자로 태운다
  write 메서드를 호출하더라도 즉시 출력대상으로 콘솔에 전송되지는 않고 내부 버퍼에 저장이 된다고 합니다. flush 메소드를 호출하거나 close()메소드 만으로도 출력이 가능하다 .
 */
public class BOJ19637 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;

    static String[] chinghoNames;

    static int[] combatPowers;
    public static void main(String[] args) throws IOException {

        stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        chinghoNames = new String[n];
        combatPowers = new int[n];
        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            chinghoNames[i] = stk.nextToken();
            combatPowers[i] = Integer.parseInt(stk.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int combatPower = Integer.parseInt(br.readLine());
            int left = 0, right = n - 1;
            left = binarySearch(combatPower, left, right);
            bw.write(chinghoNames[left] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    private static int binarySearch(int combatPower, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (combatPowers[middle] < combatPower) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
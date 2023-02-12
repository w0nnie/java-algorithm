import java.io.*;
import java.util.*;

public class Main {
    /**
     * 슈도코드
     * 정렬되어있는 A,B 두 배열을 합친 다음 정렬해서 출력하는 프로그램
     *
     * A의 크기 N,  B의 크기 M
     * A의 내용
     * B의 내용
     *
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());
        List<Integer> ansList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aSize; i++) {
            ansList.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bSize; i++) {
            ansList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(ansList);

        for (int i = 0; i < ansList.size(); i++) {
            bw.write(ansList.get(i) + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
import java.io.*;
import java.util.*;

public class Main {
    private static Integer R;
    private static String S;
    private static List<String> outputList = new ArrayList<>();
    private static Iterator<String> answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCaseCount = Integer.parseInt(st.nextToken());
        for (int i = 0; i < testCaseCount ; i++) {
            outputList = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();
            for (int j = 0; j <S .length() ; j++) {
                for (int k = 1; k <= R; k++) {
                    outputList.add(String.valueOf(S.charAt(j)));
                }
            }
            answer = outputList.listIterator();
            while(answer.hasNext()){
                System.out.print(answer.next());
            }
            System.out.println();
        }
    }
}

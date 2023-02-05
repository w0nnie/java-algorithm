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
        long[] s = new long[suNo + 1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=suNo; i++){
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }
        for(int q=0; q<quNo; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(s[j] - s[i-1]);
        }
    }

}

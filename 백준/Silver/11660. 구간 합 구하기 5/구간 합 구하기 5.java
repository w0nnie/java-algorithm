import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrSize = Integer.parseInt(st.nextToken());
        int quiz = Integer.parseInt(st.nextToken());
        long s[][] = new long[arrSize + 1][arrSize + 1];
        for(int i=1; i<=arrSize; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=arrSize; j++){
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        long sum[][] = new long[arrSize + 1][arrSize + 1];
        for(int i=1; i<=arrSize; i++){
            for(int j=1; j<=arrSize; j++){
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + s[i][j];
            }
        }
        for(int i=0; i<quiz; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            long result = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
            System.out.println(result);
        }
    }

}

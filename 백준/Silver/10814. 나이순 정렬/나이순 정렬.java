import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int n = Integer.parseInt(br.readLine());

        String[][] name = new String[n][];

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            String[] arr = new String[2];
            arr[0] = stk.nextToken();
            arr[1] = stk.nextToken();
            name[i] = arr;
        }

        Arrays.sort(name, (a,b) -> Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0])));


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < name[i].length; j++) {
                System.out.print(name[i][j] + " ");
            }
            System.out.println();
        }
    }
}

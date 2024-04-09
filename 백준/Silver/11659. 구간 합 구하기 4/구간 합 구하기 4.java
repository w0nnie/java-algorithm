import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int elementCount = Integer.parseInt(stk.nextToken());
        int howManyTime = Integer.parseInt(stk.nextToken());
        int[] sumArr = new int[elementCount + 1];

        stk = new StringTokenizer(br.readLine());
        for (int i = 1; i <= elementCount; i++) {
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(stk.nextToken());
        }

        for (int i = 0; i < howManyTime; i++) {
            stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());

            System.out.println(sumArr[b] - sumArr[a-1]);
        }
    }
}
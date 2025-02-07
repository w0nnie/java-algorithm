import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] nums;
    static String[] expressions;
    static boolean[] visit;
    static int minAnswer = Integer.MAX_VALUE;
    static int maxAnswer = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int index = 0;
        nums = new int[n];
        while (stk.hasMoreTokens()) {
            nums[index] = Integer.parseInt(stk.nextToken());
            index++;
        }

        expressions = new String[n -1];
        visit = new boolean[n -1];

        stk = new StringTokenizer(br.readLine());
        int plus = Integer.parseInt(stk.nextToken());
        int minus = Integer.parseInt(stk.nextToken());
        int multiply = Integer.parseInt(stk.nextToken());
        int modulo = Integer.parseInt(stk.nextToken());

        int expressionsIndex = 0;
        // 각 연산자를 입력한 개수만큼 배열에 넣기
        for (int i = 0; i < plus; i++) {
            expressions[expressionsIndex++] = "+";
        }
        for (int i = 0; i < minus; i++) {
            expressions[expressionsIndex++] = "-";
        }
        for (int i = 0; i < multiply; i++) {
            expressions[expressionsIndex++] = "*";
        }
        for (int i = 0; i < modulo; i++) {
            expressions[expressionsIndex++] = "/";
        }

        getDfs(0, nums[0], 1);

        System.out.println(maxAnswer);
        System.out.println(minAnswer);
    }

    public static void getDfs(int depth, int score, int numIndex) {

        if (depth == n - 1) {

            if (score > maxAnswer) {
                maxAnswer = score;
            }
            if (score < minAnswer) {
                minAnswer = score;
            }
            return;
        }

        for (int i = 0; i < expressions.length; i++) {
            if (!visit[i]) {
                int newScore = score;
                switch (expressions[i]) {
                    case "+":
                        newScore += nums[numIndex];
                        visit[i] = true;
                        break;
                    case "-":
                        newScore -= nums[numIndex];
                        visit[i] = true;
                        break;
                    case "*":
                        newScore *= nums[numIndex];
                        visit[i] = true;
                        break;
                    case "/":
                        newScore /= nums[numIndex];
                        visit[i] = true;
                        break;
                }
                getDfs(depth + 1, newScore, numIndex + 1);
                visit[i] = false;
            }
        }
    }
}

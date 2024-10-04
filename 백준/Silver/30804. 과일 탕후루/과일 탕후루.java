import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] list;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(stk.nextToken());
        }

        int answer = getAnswer(N);
        System.out.println(answer);
    }

    static int getAnswer(int N) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int start = 0;
        int max = 0;

        for (int end = 0; end < N; end++) {
            countMap.put(list[end], countMap.getOrDefault(list[end], 0) + 1);

            while (countMap.size() > 2) { //과일이 2종류를 넘게되면
                countMap.put(list[start], countMap.get(list[start]) - 1);
                if (countMap.get(list[start]) == 0) {
                    countMap.remove(list[start]);
                }
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}

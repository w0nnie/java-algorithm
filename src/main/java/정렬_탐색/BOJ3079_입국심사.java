package 정렬_탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ3079_입국심사 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer stk;
    static int tableCount;
    static int man;
    static int[] timePerTables;
    static long maxTimePerTable = 0;
    static long answer = Long.MAX_VALUE;
    public static void main(String[] args) throws IOException {

        stk = new StringTokenizer(br.readLine());

        tableCount = Integer.parseInt(stk.nextToken());
        man = Integer.parseInt(stk.nextToken());
        timePerTables = new int[tableCount];

        for (int i = 0; i < tableCount; i++) {
            timePerTables[i] = Integer.parseInt(br.readLine());
            getMaxValue(i);
        }
        
        //이분탐색 정렬 필수
        Arrays.sort(timePerTables);

        binarySearch();

        System.out.println(answer);
    }

    private static void binarySearch() {
        long left = 0; //가장 적게 걸릴 시간
        long right = man * maxTimePerTable; // 가장 많이 걸릴 시간 사람 * timePerTables 시간들중 max값

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int timePerTable : timePerTables) {
                long count = mid / timePerTable;  // 한 심사대에서 몇명을 맡을수 있는지 

                if (sum >= man) { // man을 당연히 넘을수없다. 바로 종료
                    break;
                }

                sum += count; // 일 처리 가능한 사람 수
            }
            if (sum >= man) {  //sum이 man도 크면 mid보다 작은 수 만족
                right = mid - 1;
                answer = Math.min(mid, answer);
            }else{ // 반대면 mid보다 큰수
                left = mid + 1;
            }
        }
    }

    private static void getMaxValue(int index) {
        maxTimePerTable = Math.max(maxTimePerTable, timePerTables[index]);
    }


}

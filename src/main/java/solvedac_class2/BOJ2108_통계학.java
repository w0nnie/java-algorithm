package solvedac_class2;


import java.io.*;
import java.util.*;

public class BOJ2108_통계학 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr);
        System.out.println(getAverage(arr));
        System.out.println(getMiddle(arr));
        System.out.println(getMode(arr));
        System.out.println(getRange(arr));
    }

    private static int getAverage(int[] arr) {
        int hap = 0;
        for (int i = 0; i < arr.length; i++) {
            hap += arr[i];
        }
        return Math.round(hap / (float) arr.length);
    }

    private static int getMiddle(int[] arr) {
        return arr[arr.length/2];
    }

    private static int getMode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = Collections.max(map.values());

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        return list.size() > 1 ? list.get(1) : list.get(0);
    }

    private static int getRange(int[] arr) {
        int max = arr[arr.length-1];
        int min = arr[0];
        return max - min;
    }
}

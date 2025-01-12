import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();


        while (stk.hasMoreTokens()) {
            list.add(Integer.parseInt(stk.nextToken()));
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {

            if (i == 0) {
                arr[i] = list.get(i);
            } else{
                arr[i] = list.get(i) + arr[i-1];
            }
        }
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }


        System.out.println(answer);
    }
}

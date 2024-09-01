import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        StringTokenizer stk;
        for (int i = 0; i < count; i++) {
            stk = new StringTokenizer(br.readLine());
            int[] a = new int[2];
            a[0] = Integer.parseInt(stk.nextToken()); //weight
            a[1] = Integer.parseInt(stk.nextToken()); //height
            list.add(a);
        }

        getRank(list, count);


    }

    private static void getRank(List<int[]> list, int count) {
        int[] rank = new int[count];
        for (int i = 0; i < list.size(); i++) {
            int bigger = 1;
            int myWeight = list.get(i)[0];
            int myHeight = list.get(i)[1];
            for (int j = 0; j < list.size(); j++) {
                int bodyPoint = 0;
                int yourWeight = list.get(j)[0];
                int yourHeight = list.get(j)[1];

                if (myHeight < yourHeight) {
                    bodyPoint++;
                }
                if (myWeight < yourWeight) {
                    bodyPoint++;
                }
                if (bodyPoint == 2) {
                    bigger++;
                }
            }
            rank[i] = bigger;
        }

        for (int i = 0; i < rank.length; i++) {
            System.out.print(rank[i] + " ");
        }

    }

}

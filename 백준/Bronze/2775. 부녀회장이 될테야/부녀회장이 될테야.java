import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] apt = new int[14 + 1][14 + 1];

        for (int i = 1; i < apt[0].length; i++) {
            apt[0][i-1] = i;
            apt[i][0] = 1;
        }

        //set Dp
        for (int i = 1; i < apt[0].length; i++) {
            for (int j = 1; j < apt[0].length; j++) {
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }
        }

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int floor = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());

            if (ho == 1) {
                System.out.println(1);
            } else{
                System.out.println(apt[floor][ho -1]);
            }
        }
    }
}

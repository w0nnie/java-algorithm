import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("-");
        boolean flag = true;
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            String[] arrs = arr[i].split("\\+");

            for (int j = 0; j < arrs.length; j++) {
                temp += Integer.parseInt(arrs[j]);
            }
            if (flag) {
                answer = temp;
                flag = false;
            } else {
                answer -= temp;
            }
        }
        System.out.println(answer);
    }
}

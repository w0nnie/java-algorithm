import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int[] nums = new int[n];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < nums.length; i++) {
            isPrimeNumber(nums[i]);
        }
        System.out.println(count);
    }

    private static void isPrimeNumber(int num) {
        int temp = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                temp +=1;
                break;
            }
        }
        if(num != 1 && temp == 0){
            count += 1;
        }
    }
}

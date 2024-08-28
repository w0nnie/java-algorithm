package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28702_FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        arr[0] = br.readLine();
        arr[1] = br.readLine();
        arr[2] = br.readLine();
        int num = getNextNum(arr);
        String answer = getFizzBuzz(num);
        System.out.println(answer);
    }

    private static String getFizzBuzz(int num) {
        if (num % 15 ==0) {
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(num);
        }
    }

    private static int getNextNum(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                return Integer.parseInt(arr[i]) + (3-i);
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }

}

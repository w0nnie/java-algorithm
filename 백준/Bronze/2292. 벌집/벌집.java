import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int rangeStart= 1;
        int rangeEnd = rangeStart + count * 6;
        int temp;
        int answer;

        while (true) {

            if (n == 1) {
                answer = 1;
                break;
            }

            if (rangeStart <= n && n <= rangeEnd) {
                answer = count + 1;
                break;
            } else {
                count++;
                temp = rangeEnd;
                // 다음범위 갱신
                rangeStart = rangeEnd + 1;
                rangeEnd = temp + count * 6;
            }
        }
        System.out.println(answer);
    }
}

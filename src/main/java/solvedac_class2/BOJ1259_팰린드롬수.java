package solvedac_class2;

import java.io.*;
import java.util.*;

public class BOJ1259_팰린드롬수 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            String reverse = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reverse += input.charAt(i);
            }

            if (input.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

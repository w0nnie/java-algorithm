package 자료구조;

import java.io.*;
import java.util.Stack;

public class BOJ9093_단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int howManyTime = Integer.parseInt(br.readLine());
        for (int i = 0; i < howManyTime; i++) {
            Stack stack = new Stack();
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                char word = input.charAt(j);

                if (word == ' ') {
                    while (!stack.isEmpty()) {
                        bw.write(String.valueOf(stack.pop()));

                    }
                    bw.write(" ");
                }else{
                    stack.add(word);
                }
            }
            while (!stack.isEmpty()) {
                bw.write(String.valueOf(stack.pop()));
            }
            bw.newLine();
        }
        bw.flush();
        br.close();
    }
}


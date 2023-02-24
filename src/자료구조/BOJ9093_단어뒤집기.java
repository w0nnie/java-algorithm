package 자료구조;


import java.awt.*;
import java.io.*;
import java.util.Stack;

public class BOJ9093_단어뒤집기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            Stack stack = new Stack();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    while(!stack.isEmpty()){
                        bw.write(String.valueOf(stack.pop()));
                    }
                    bw.write(" ");
                }else{
                    stack.add(s.charAt(j));
                }
            }
            while(!stack.isEmpty()){
                bw.write(String.valueOf(stack.pop()));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}


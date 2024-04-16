package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class BOJ11286_절댓값힙_시간초과 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                if (list.isEmpty()) {
                    System.out.println(0);
                } else {
                    int min = 1000000001;
                    int minIndex = 0;
                    for (int j = 0; j < list.size(); j++) {
                        int number = Math.abs(list.get(j));
                        if (min > number) {
                            min = number;
                            minIndex = j;
                        } else if (min == number) {
                            minIndex = list.get(minIndex) < list.get(j) ? minIndex : j;
                        }
                    }
                    System.out.println(list.remove(minIndex));
                }
            } else {
                list.add(n);
            }
        }
    }
}

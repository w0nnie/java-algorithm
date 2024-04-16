package 자료구조;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ11286_절댓값힙 {
    /**
     * 배열에 X를 넣는다.
     *
     * x가 0이 아니라면 배열에 x라는 값을 넣는
     * x가 0이라면 배열에서 절댓값이 가장 작은 값을 출력
     * 절댓값이 가장 작은 값이 여러개일 때, 가장 작은 수 출력
     * 배열이 비어있으면 0 출력
     *
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 > o2 ? 1 : -1;
                }
                return Math.abs(o1) - Math.abs(o2);
            }
        });


        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(br.readLine());

            if (X == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(X);
            }
        }
    }
}

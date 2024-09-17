import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2606_바이러스 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int computer = Integer.parseInt(br.readLine());
        boolean[] visit = new boolean[computer + 1];
        int[][] node = new int[computer + 1][computer + 1]; // 1~ computer
        int answer = 0;
        int count = 1;
        int graph = Integer.parseInt(br.readLine());

        for (int i = 0; i < graph; i++) {
            stk = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(stk.nextToken());
            int endNode = Integer.parseInt(stk.nextToken());

            node[startNode][endNode] = 1;
            node[endNode][startNode] = 1;
            if (startNode == 1 || endNode == 1) {
                visit[endNode] = true;
                visit[startNode] = true;
            }
        }

        while (count != computer) {
            for (int i = 0; i < visit.length; i++) {
                if (visit[i] == true) {
                    for (int j = 0; j < node[i].length; j++) {
                        if (node[i][j] == 1) {
                            visit[j] = true;
                        }
                    }
                }
            }
            count++;
        }

        visit[1] = false;
        for (boolean b : visit) {
            if(b == true) answer++;
        }

        System.out.println(answer);
    }
}


/**
 *
 computer 변수 입력값만큼의
 visit[computer] 배열
 node[computer][computer] 2차원 배열을 만들어 준다.

 node 2차원배열에 입력받은 시작점과 끝점을 index로 한 곳에 값을 1로 넣어준다.
 2중 체크를 위해 끝점, 시작점을 index로 한 곳에 값을 1로 넣어준다.

 시작점과 끝점을 입력받을때,
 1번컴퓨터에 연결되어 있는 끝점 혹은 시작점을 TRUE로 꺾어준다.

 visit배열을 순회하면서 i가 true인 경우에
 node[i] 행의 열을 순회하게된다.
 node[i][j]가 1인경우  1번컴퓨터와 연결되어있는 컴퓨터와 연결되어 있는 컴퓨터기 때문에
 visit배열을 TRUE로 꺾어준다.
 이 과정을 computer 변수 만큼 반복해준다.
 */
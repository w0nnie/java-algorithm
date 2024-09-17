import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int numRange = Integer.parseInt(br.readLine());
        boolean[] visit = new boolean[numRange + 1];
        int[][] node = new int[numRange + 1][numRange + 1]; // 1~ numRange
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

        while (count != numRange) {
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

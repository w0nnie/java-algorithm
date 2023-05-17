package DFS_백트래킹;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10971_외판원_순회3 {

    static int[][] cityGraph;
    static int N;

    private static int tsp(boolean[] visited, int currentCity, int n, int count, int cost, int minCost) {
    if (count == n && cityGraph[currentCity][0] != 0) {
        minCost = Math.min(minCost, cost + cityGraph[currentCity][0]);
        return minCost;
    }

    for (int i = 0; i < n; i++) {
        if (!visited[i] && cityGraph[currentCity][i] != 0) {
            visited[i] = true;
            minCost = tsp(visited, i, n, count + 1, cost + cityGraph[currentCity][i], minCost);
            visited[i] = false;
        }
    }

    return minCost;
}

    public static int solveTSP() {
        boolean[] visited = new boolean[N];
        visited[0] = true; // Start from the first city
        int minCost = Integer.MAX_VALUE;

        minCost = tsp( visited, 0, N, 1, 0, minCost);

        return minCost;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        N = Integer.parseInt(stk.nextToken());

        cityGraph = new int[N][N]; //도시 간의 거리를 나타내는 인접 행렬.

        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                cityGraph[i][j] = Integer.parseInt(stk.nextToken());
            }
        }


        int minCost = solveTSP();
        System.out.println("Minimum cost for TSP: " + minCost);
    }
}

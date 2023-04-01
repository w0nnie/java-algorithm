package dfs_bfs;

import java.util.Scanner;

public class BOJ2606_바이러스 {
    static int[][] network;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int computerCount = sc.nextInt();
        int connection = sc.nextInt();

        network = new int[computerCount + 1][computerCount + 1];
        for (int i = 0; i < connection; i++) {
            int startNode = sc.nextInt();
            int endNode = sc.nextInt();
            network[startNode][endNode] = 1;
            network[endNode][startNode] = 1;
        }

        visited = new boolean[computerCount + 1];

        dfs(1);
        System.out.println(count);
    }

    private static void dfs(int startNode) {
        visited[startNode] = true;
        for (int i = 0; i < network.length; i++) {
            if (network[startNode][i] ==1 && !visited[i]) {
                count++;
                dfs(i);
            }
        }
    }
}